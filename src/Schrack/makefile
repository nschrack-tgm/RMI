JFLAGS = -g
JC = javac -cp ./
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Calculator.java \
	CalculatorImpl.java \
	PiServer.java \
	Start.java \
	MyClient.java  
	
default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
