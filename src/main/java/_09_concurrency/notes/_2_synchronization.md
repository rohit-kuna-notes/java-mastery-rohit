# Synchronization

- `synchronized` keyword
    - method level
    - block level
- Intrinsic lock (monitor)
- Object-level lock vs Class-level lock
- Conditions
- Locks (`java.util.concurrent.locks`)
    - `ReentrantLock`
    - `ReadWriteLock`
    - Fair vs Unfair locks
- Deadlock and resolution (lock ordering, `tryLock`)

See: `src/synchronization/_1.._5` — shows the bug (lost updates), method-level sync, block-level sync,
and the class-level-lock blocking issue + its fix using separate lock objects.
