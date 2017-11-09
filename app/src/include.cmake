# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

include_directories(
        src/main/cpp
        src/main/cpp/Thirdparty
        src/main/cpp/Thirdparty/g2o/g2o
        src/main/cpp/ORB_SLAM2/include
        src/main/cpp/Thirdparty/DBoW2/DLib/include/DUtils
        src/main/cpp/Thirdparty/DBoW2/DLib/include
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2
        src/main/cpp/Thirdparty/DBoW2/include
        src/main/cpp/Thirdparty/eigen3
        src/main/cpp/Thirdparty/OpenCV-android-sdk/sdk/native/jni/include
)
