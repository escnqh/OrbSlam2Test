# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.
set(CMAKE_VERBOSE_MAKEFILE on)
set(libs "${CMAKE_SOURCE_DIR}/src/main/jniLibs")
include_directories(${CMAKE_SOURCE_DIR}/src/main/cpp/Thirdparty/OpenCV-android-sdk/sdk/native/jni/include)

add_library(libopencv_java3 SHARED IMPORTED )
set_target_properties(libopencv_java3 PROPERTIES
        IMPORTED_LOCATION "${libs}/${ANDROID_ABI}/libopencv_java3.so")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11 -fexceptions -frtti")
add_library(DLib
            SHARED
        src/main/cpp/Thirdparty/DBoW2/DLib/include/DUtils/Random.h
        src/main/cpp/Thirdparty/DBoW2/DLib/include/DUtils/Timestamp.h
        src/main/cpp/Thirdparty/DBoW2/DLib//DUtils/Random.cpp
        src/main/cpp/Thirdparty/DBoW2/DLib//DUtils/Timestamp.cpp
)
add_library(DBoW2
            SHARED
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/BowVector.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/FClass.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/FeatureVector.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/FORB.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/ScoringObject.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/TemplatedVocabulary.h
        src/main/cpp/Thirdparty/DBoW2/src/BowVector.cpp
        src/main/cpp/Thirdparty/DBoW2/src/FClass.cpp
        src/main/cpp/Thirdparty/DBoW2/src/FeatureVector.cpp
        src/main/cpp/Thirdparty/DBoW2/src/FORB.cpp
        src/main/cpp/Thirdparty/DBoW2/src/ScoringObject.cpp
        src/main/cpp/Thirdparty/DBoW2/src/TemplatedVocabulary.cpp


)
ADD_LIBRARY(g2o

            SHARED

        src/main/cpp/Thirdparty/g2o/g2o/types/types_sba.h
        src/main/cpp/Thirdparty/g2o/g2o/types/types_six_dof_expmap.h
        src/main/cpp/Thirdparty/g2o/g2o/types/types_sba.cpp
        src/main/cpp/Thirdparty/g2o/g2o/types/types_six_dof_expmap.cpp
        src/main/cpp/Thirdparty/g2o/g2o/types/types_seven_dof_expmap.cpp
        src/main/cpp/Thirdparty/g2o/g2o/types/types_seven_dof_expmap.h
        src/main/cpp/Thirdparty/g2o/g2o/types/se3quat.h
        src/main/cpp/Thirdparty/g2o/g2o/types/se3_ops.h
        src/main/cpp/Thirdparty/g2o/g2o/types/se3_ops.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/base_edge.h
        src/main/cpp/Thirdparty/g2o/g2o/core/base_binary_edge.h
        src/main/cpp/Thirdparty/g2o/g2o/core/hyper_graph_action.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/base_binary_edge.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/hyper_graph_action.h
        src/main/cpp/Thirdparty/g2o/g2o/core/base_multi_edge.h
        src/main/cpp/Thirdparty/g2o/g2o/core/hyper_graph.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/base_multi_edge.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/hyper_graph.h
        src/main/cpp/Thirdparty/g2o/g2o/core/base_unary_edge.h
        src/main/cpp/Thirdparty/g2o/g2o/core/linear_solver.h
        src/main/cpp/Thirdparty/g2o/g2o/core/base_unary_edge.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/marginal_covariance_cholesky.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/base_vertex.h
        src/main/cpp/Thirdparty/g2o/g2o/core/marginal_covariance_cholesky.h
        src/main/cpp/Thirdparty/g2o/g2o/core/base_vertex.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/matrix_structure.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/batch_stats.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/matrix_structure.h
        src/main/cpp/Thirdparty/g2o/g2o/core/batch_stats.h
        src/main/cpp/Thirdparty/g2o/g2o/core/openmp_mutex.h
        src/main/cpp/Thirdparty/g2o/g2o/core/block_solver.h
        src/main/cpp/Thirdparty/g2o/g2o/core/block_solver.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/parameter.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/parameter.h
        src/main/cpp/Thirdparty/g2o/g2o/core/cache.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/cache.h
        src/main/cpp/Thirdparty/g2o/g2o/core/optimizable_graph.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/optimizable_graph.h
        src/main/cpp/Thirdparty/g2o/g2o/core/solver.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/solver.h
        src/main/cpp/Thirdparty/g2o/g2o/core/creators.h
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_factory.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/estimate_propagator.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_factory.h
        src/main/cpp/Thirdparty/g2o/g2o/core/estimate_propagator.h
        src/main/cpp/Thirdparty/g2o/g2o/core/factory.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_property.h
        src/main/cpp/Thirdparty/g2o/g2o/core/factory.h
        src/main/cpp/Thirdparty/g2o/g2o/core/sparse_block_matrix.h
        src/main/cpp/Thirdparty/g2o/g2o/core/sparse_optimizer.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/sparse_block_matrix.hpp
        src/main/cpp/Thirdparty/g2o/g2o/core/sparse_optimizer.h
        src/main/cpp/Thirdparty/g2o/g2o/core/hyper_dijkstra.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/hyper_dijkstra.h
        src/main/cpp/Thirdparty/g2o/g2o/core/parameter_container.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/parameter_container.h
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm.h
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_with_hessian.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_with_hessian.h
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_levenberg.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/optimization_algorithm_levenberg.h
        src/main/cpp/Thirdparty/g2o/g2o/core/jacobian_workspace.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/jacobian_workspace.h
        src/main/cpp/Thirdparty/g2o/g2o/core/robust_kernel.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/robust_kernel.h
        src/main/cpp/Thirdparty/g2o/g2o/core/robust_kernel_factory.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/robust_kernel_factory.h
        src/main/cpp/Thirdparty/g2o/g2o/core/robust_kernel_impl.cpp
        src/main/cpp/Thirdparty/g2o/g2o/core/robust_kernel_impl.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/string_tools.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/color_macros.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/macros.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/timeutil.cpp
        src/main/cpp/Thirdparty/g2o/g2o/stuff/misc.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/timeutil.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/os_specific.c
        src/main/cpp/Thirdparty/g2o/g2o/stuff/os_specific.h
        src/main/cpp/Thirdparty/g2o/g2o/stuff/string_tools.cpp
        src/main/cpp/Thirdparty/g2o/g2o/stuff/property.cpp
        src/main/cpp/Thirdparty/g2o/g2o/stuff/property.h
        )

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
add_library(ORB_SLAM2

            SHARED

        src/main/cpp/ORB_SLAM2/include/System.h
        src/main/cpp/ORB_SLAM2/include/Tracking.h
        src/main/cpp/ORB_SLAM2/include/LocalMapping.h
        src/main/cpp/ORB_SLAM2/include/LoopClosing.h
        src/main/cpp/ORB_SLAM2/include/ORBextractor.h
        src/main/cpp/ORB_SLAM2/include/ORBmatcher.h
        src/main/cpp/ORB_SLAM2/include/FrameDrawer.h
        src/main/cpp/ORB_SLAM2/include/Converter.h
        src/main/cpp/ORB_SLAM2/include/MapPoint.h
        src/main/cpp/ORB_SLAM2/include/KeyFrame.h
        src/main/cpp/ORB_SLAM2/include/Map.h
        src/main/cpp/ORB_SLAM2/include/Optimizer.h
        src/main/cpp/ORB_SLAM2/include/PnPsolver.h
        src/main/cpp/ORB_SLAM2/include/Frame.h
        src/main/cpp/ORB_SLAM2/include/KeyFrameDatabase.h
        src/main/cpp/ORB_SLAM2/include/Sim3Solver.h
        src/main/cpp/ORB_SLAM2/include/Initializer.h
        #src/main/cpp/ORB_SLAM2/include/Common.h
        src/main/cpp/ORB_SLAM2/src/System.cc
        src/main/cpp/ORB_SLAM2/src/Tracking.cc
        src/main/cpp/ORB_SLAM2/src/LocalMapping.cc
        src/main/cpp/ORB_SLAM2/src/LoopClosing.cc
        src/main/cpp/ORB_SLAM2/src/ORBextractor.cc
        src/main/cpp/ORB_SLAM2/src/ORBmatcher.cc
        src/main/cpp/ORB_SLAM2/src/FrameDrawer.cc
        src/main/cpp/ORB_SLAM2/src/Converter.cc
        src/main/cpp/ORB_SLAM2/src/MapPoint.cc
        src/main/cpp/ORB_SLAM2/src/KeyFrame.cc
        src/main/cpp/ORB_SLAM2/src/Map.cc
        src/main/cpp/ORB_SLAM2/src/Optimizer.cc
        src/main/cpp/ORB_SLAM2/src/PnPsolver.cc
        src/main/cpp/ORB_SLAM2/src/Frame.cc
        src/main/cpp/ORB_SLAM2/src/KeyFrameDatabase.cc
        src/main/cpp/ORB_SLAM2/src/Sim3Solver.cc
        src/main/cpp/ORB_SLAM2/src/Initializer.cc

        ############DBow2############
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/BowVector.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/FORB.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/FClass.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/FeatureVector.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/ScoringObject.h
        src/main/cpp/Thirdparty/DBoW2/include/DBoW2/TemplatedVocabulary.h
        src/main/cpp/Thirdparty/DBoW2/DLib/include/DUtils/Random.h
        src/main/cpp/Thirdparty/DBoW2/DLib/include/DUtils/Timestamp.h
        src/main/cpp/Thirdparty/DBoW2/src/BowVector.cpp
        src/main/cpp/Thirdparty/DBoW2/src/FORB.cpp
        src/main/cpp/Thirdparty/DBoW2/src/FeatureVector.cpp
        src/main/cpp/Thirdparty/DBoW2/src/ScoringObject.cpp
        src/main/cpp/Thirdparty/DBoW2/DLib/src/DUtils/Random.cpp
        src/main/cpp/Thirdparty/DBoW2/DLib/src/DUtils/Timestamp.cpp
        ############OPENCV############

        )
add_library( # Sets the name of the library.
           native-lib

             # Sets the library as a shared library.
           SHARED

             # Provides a relative path to your source file(s).
            src/main/cpp/native-lib.cpp )

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
              log-lib
              #D:/Android/Project/OrbSlam2Test/app/src/main/cpp/Thirdparty/OpenCV-android-sdk/sdk/native/libs/${ANDROID_ABI}
              # Specifies the name of the NDK library that
              # you want CMake to locate.
            log)

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries(native-lib
                        libopencv_java3 libopencv_java
                        DLib
                        DBoW2
                       g2o
                       ORB_SLAM2
                        ${log-lib}
                       # Links the target library to the log library
                       # included in the NDK.
                        )