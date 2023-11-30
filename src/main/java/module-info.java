module ModuloJavaNewFeatures {
	exports com.devarthursilva.java8.annotations;
	exports com.devarthursilva.java8.stringjoiner;
	exports com.devarthursilva.java8.base64;
	exports com.devarthursilva.java8.reflect;
	exports com.devarthursilva.java8.stream;
	exports com.devarthursilva.java8.parallelsorting;
	exports com.devarthursilva.java8.interfacefuncional;
	exports com.devarthursilva.java8.methodreferences;
	exports com.devarthursilva.java8.optional;
	//exports com.devarthursilva.java9.jigsaw;
	exports com.devarthursilva.java8.inferenciadetipos;
	exports com.devarthursilva.java8.lambdaexpressions;
	
	requires java.net.http;
	requires java.desktop;
}