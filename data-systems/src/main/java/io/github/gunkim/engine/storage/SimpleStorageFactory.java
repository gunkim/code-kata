package io.github.gunkim.engine.storage;

public class SimpleStorageFactory<T> implements StorageFactory<T> {
    @Override
    public Storage<T> createSimpleStorage(String path) {
        return new SimpleStorage<>(path);
    }
}
