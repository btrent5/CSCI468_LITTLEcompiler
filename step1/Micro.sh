# !/bin/bash
# Check if correct antlr jar is available, if not, download it.
function check_antlr_jar {
  if [ ! -f ./antlr-4.7.2-complete.jar ]; then
      echo "No ANTLR JAR found, downloading it now..."
      curl -O https://www.antlr.org/download/antlr-4.7.2-complete.jar
  fi
}

# Generate antlr files and compile everything.
function setup {
    # echo "Generating and compiling Files..."
    export CLASSPATH="./antlr-4.7.2-complete.jar:$CLASSPATH"
    java -jar ./antlr-4.7.2-complete.jar little_grammar.g4
    javac little_grammar*.java
    javac printTokens.java
}

# Remove generated files.
function remove_files {
    # echo "Removing generated files..."
    rm -rf *.class
    rm -rf little_grammar*.java
    rm -rf *.tokens
    rm -rf *.interp
}

# execute program.
check_antlr_jar
setup

java printTokens $1

remove_files
