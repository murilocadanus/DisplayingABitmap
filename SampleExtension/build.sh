#!/bin/bash
#(cd native && haxelib run hxcpp Build.xml -Diphoneos -DHXCPP_ARM   -DHXCPP_CLANG -DOBJC_ARC)
#(cd native && haxelib run hxcpp Build.xml -Diphoneos -DHXCPP_ARMV7 -DHXCPP_CLANG -DOBJC_ARC)
#(cd native && haxelib run hxcpp Build.xml -Diphoneos -DHXCPP_ARM64 -DHXCPP_CLANG -DOBJC_ARC)
#(cd native && haxelib run hxcpp Build.xml -Diphonesim -DHXCPP_CPP11 -DHXCPP_CLANG -DOBJC_ARC)
#(cd native && haxelib run hxcpp Build.xml -Diphonesim -DHXCPP_CPP11 -DHXCPP_M64 -DHXCPP_CLANG -DOBJC_ARC)
(cd project && haxelib run hxcpp Build.xml -Dandroid -DHXCPP_CPP11 -DHXCPP_ARM)
(cd project && haxelib run hxcpp Build.xml -Dandroid -DHXCPP_CPP11 -DHXCPP_ARMV7)
(cd project && haxelib run hxcpp Build.xml -Dandroid -DHXCPP_CPP11 -DHXCPP_X86)
