javac --module-source-path src -d out $(find . -name '*.java')
java -mp out -m main/bookapp.BookApp;
