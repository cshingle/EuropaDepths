#!/bin/sh

function copy_vanilla () {
    charactor=$1
    # Make directory if it does not exist
    mkdir -p Characters/$charactor
    # Create new file with xml headers and opening override tag
    echo -e '<?xml version="1.0" encoding="utf-8" ?>\r\n<Override>' > Characters/$charactor/$charactor.xml
    # Insert data from vanilla
    cat ~/.steam/debian-installation/steamapps/common/Barotrauma/Content/Characters/$charactor/$charactor.xml >> Characters/$charactor/$charactor.xml
    # Append closing override block
    echo '</Override>' >> Characters/$charactor/$charactor.xml
    # Strip bom charactor if it gets inserted
    sed -i $'s|\uFEFF||' Characters/$charactor/$charactor.xml

    # Override ragdolls
    sed -i "s|<ragdolls[^>]*/>|<ragdolls folder=\"%ModDir%/Characters/$charactor/Ragdolls/\" />|" Characters/$charactor/$charactor.xml
    sed -i "s|<animations[^>]*/>|<animations folder=\"Content/Characters/$charactor/Animations\"/>|" Characters/$charactor/$charactor.xml

    mkdir -p Characters/$charactor/Ragdolls
    cp ~/.steam/debian-installation/steamapps/common/Barotrauma/Content/Characters/$charactor/Ragdolls/${charactor}DefaultRagdoll.xml Characters/$charactor/Ragdolls/
}

function can_enter_sub () {
    charactor=$1
    sed -i 's|canentersubmarine="False"|canentersubmarine="True"|' Characters/$charactor/Ragdolls/${charactor}DefaultRagdoll.xml
}

function aggressive_boarding () {
    charactor=$1
    sed -i 's|aggressiveboarding="False"|aggressiveboarding="True"|' Characters/$charactor/$charactor.xml
}

rm -f contentpackage
mkdir -p Characters

while read -r line      # read a line from file.
do
  echo "$line"
  copy_vanilla "$line"
  can_enter_sub "$line"
  echo "  <Character file=\"%ModDir%/Characters/${line}/${line}.xml\" />" >> contentpackage
done < can_enter_sub

while read -r line      # read a line from file.
do
  copy_vanilla "$line"
  can_enter_sub "$line"
  aggressive_boarding "$line"
  echo "  <Character file=\"%ModDir%/Characters/${line}/${line}.xml\" />" >> contentpackage
done < aggressiveboarding

sort -u contentpackage
echo See contentpackage for files that need to be added to filelist.xml