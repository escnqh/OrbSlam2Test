APP_STL := gnustl_static
APP_CPPFLAGS := -frtti -fexceptions -mfloat-abi=softfp -Wno-deprecated -mfpu=neon -std=gnu++0x \
-ftree-vectorize -ffast-math -fsingle-precision-constant
NDK_TOOLCHAIN_VERSION := 4.9
APP_CPPFLAGS := --std=c++11
APP_ABI :=armeabi-v7a
APP_OPTIM := release
APP_SHORT_COMMANDS      := true
APP_ALLOW_MISSING_DEPS :=true  
#-Wno-deprecated