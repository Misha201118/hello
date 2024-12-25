
JAVAC ?= javac
JAVA  ?= java

.PHONY: run clean

all: Main.class
	@echo "now you can type"
	@echo "  make run"

Main.class: Main.java Book.class Circle.class Student.class
	$(JAVAC) $<

Book.class: Book.java
	$(JAVAC) $<

Circle.class: Circle.java
	$(JAVAC) $<

Student.class: Student.java
	$(JAVAC) $<

run: Main.class
	$(JAVA) Main

clean:
	rm $(wildcard *.class)
