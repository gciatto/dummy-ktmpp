Two dummy & interdependent Kt multi-platform projects: `a` and `b`.
The latter depends on the former (`b` depends on `a`).
Both are configure to compile on both the JVM and JS.


## Problem

Running:
```bash
./gradlew jsMainClasses
```
produces:
```
> Task :a:compileKotlinJs FAILED
e: /home/gciatto/Work/Code/dummy-ktmpp/a/src/commonMain/kotlin/org/example/a/BigInt.kt: (9, 11): Declaration of such kind (interface) cant be exported to JS

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':a:compileKotlinJs'.
> Compilation error. See log for more details

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 50s
6 actionable tasks: 6 executed
```