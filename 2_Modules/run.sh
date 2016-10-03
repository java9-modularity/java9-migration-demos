javac --module-source-path src -d out $(find . -name '*.java')
java --module-path out -m main/bookapp.BookApp;
