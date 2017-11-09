#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_orb_orb_1slam2_1test_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
