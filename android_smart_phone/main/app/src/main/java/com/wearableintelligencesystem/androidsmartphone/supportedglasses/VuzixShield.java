package com.wearableintelligencesystem.androidsmartphone.supportedglasses;

public class VuzixShield extends SmartGlassesDevice {
    public VuzixShield() {
        deviceModelName = "Vuzix Shield";
        deviceIconName = "vuzix_shield";
        anySupport = true;
        fullSupport = false;
        glassesOs = SmartGlassesOperatingSystem.ANDROID_OS_GLASSES;
        hasDisplay = true;
        hasSpeakers = true;
        hasCamera = true;
        hasInMic = true;
        hasOutMic = true;
        weight = 140;
    }
}