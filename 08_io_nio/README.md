# 08 — I/O & NIO (new topic)

File and stream I/O, both the classic `java.io` API and the newer `java.nio`/`java.nio.file` APIs,
plus serialization basics.

## Action Plan
- [ ] `java.io`: `File`, `FileReader`/`FileWriter`, `BufferedReader`/`BufferedWriter`, `InputStream`/`OutputStream`
- [ ] Byte streams vs character streams
- [ ] `java.nio.file`: `Path`, `Paths`, `Files` (read/write/walk/exists)
- [ ] `try-with-resources` for closing streams (links to [07_exceptions](../07_exceptions))
- [ ] Serialization: `Serializable`, `transient`, `serialVersionUID`; why it's discouraged today
- [ ] Buffered vs unbuffered I/O performance
- [ ] Reading/writing JSON-like data with plain Java (brief, since libraries usually handle this)

## Structure
- `notes/` — reference notes per subtopic
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic
- `src/` — completed reference examples
