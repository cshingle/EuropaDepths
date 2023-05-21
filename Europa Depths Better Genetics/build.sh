#!/bin/sh
set -e

function copy_vanilla () {
    charactor=Humanhusk
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
    echo "bom stripped"

    # Override huskappendages
    sed -i "s/Content\/Characters\/Humanhusk\/Huskappendage\.xml/%ModDir%\/Huskappendage.xml/" Characters/$charactor/$charactor.xml
    sed -i "s/Content\/Characters\/Humanhusk\/Huskappendagesymbiosis\.xml/%ModDir%\/Huskappendagesymbiosis.xml/" Characters/$charactor/$charactor.xml
    sed -i "s/Content\/Characters\/Humanhusk\/Mudraptorbeak\.xml/%ModDir%\/Mudraptorbeak.xml/" Characters/$charactor/$charactor.xml
    sed -i "s/Content\/Characters\/Humanhusk\/Spinelingspine\.xml/%ModDir%\/Spinelingspine.xml/" Characters/$charactor/$charactor.xml
    echo "huskappendage overriden"

    # Set annimation paths
    sed -i "s/ragdolls folder=\"default/ragdolls folder=\"Content\/Characters\/Human\/Ragdolls/" Characters/$charactor/$charactor.xml
    sed -i "s/animations folder=\"default/animations folder=\"Content\/Characters\/Humanhusk\/Animations/" Characters/$charactor/$charactor.xml
}

rm -rf Characters
mkdir -p Characters
copy_vanilla
echo HuskHuman charactor copied and modified
