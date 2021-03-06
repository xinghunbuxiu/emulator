package cn.banny.emulator.linux.android.dvm;

import cn.banny.emulator.Emulator;

public abstract class AbstractJni implements Jni {

    @Override
    public DvmObject getStaticObjectField(VM vm, DvmClass dvmClass, String signature) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public int getStaticIntField(DvmClass dvmClass, String signature) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public DvmObject getObjectField(VM vm, DvmObject dvmObject, String signature) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public boolean callStaticBooleanMethodV(String signature) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public int callStaticIntMethodV(String signature, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public DvmObject callObjectMethodV(VM vm, DvmObject dvmObject, String signature, String methodName, String args, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public DvmObject callStaticObjectMethod(VM vm, DvmClass dvmClass, String signature, String methodName, String args, Emulator emulator) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public DvmObject callStaticObjectMethodV(VM vm, DvmClass dvmClass, String signature, String methodName, String args, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public int callIntMethodV(BaseVM vm, DvmObject dvmObject, String signature, String methodName, String args, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public long callStaticLongMethodV(String signature, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public boolean callBooleanMethodV(BaseVM vm, DvmObject dvmObject, String signature, String methodName, String args, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public int getIntField(BaseVM vm, DvmObject dvmObject, String signature) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public void callStaticVoidMethodV(String signature, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public void setObjectField(BaseVM vm, DvmObject dvmObject, String signature, DvmObject value) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public boolean getBooleanField(BaseVM vm, DvmObject dvmObject, String signature) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public DvmObject newObject(DvmClass clazz, String signature, Emulator emulator) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public DvmObject newObjectV(DvmClass clazz, String signature, VaList vaList) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public void setIntField(BaseVM vm, DvmObject dvmObject, String signature, int value) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public void setLongField(BaseVM vm, DvmObject dvmObject, String signature, long value) {
        throw new AbstractMethodError(signature);
    }

    @Override
    public void setBooleanField(BaseVM vm, DvmObject dvmObject, String signature, boolean value) {
        throw new AbstractMethodError(signature);
    }
}
