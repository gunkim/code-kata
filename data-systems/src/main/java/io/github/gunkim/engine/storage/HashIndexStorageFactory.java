package io.github.gunkim.engine.storage;

public class HashIndexStorageFactory<T> implements StorageFactory<T> {
    @Override
    public Storage<T> createSimpleStorage(String path) {
        return new HashIndexStorage<>(path);
    }
}
