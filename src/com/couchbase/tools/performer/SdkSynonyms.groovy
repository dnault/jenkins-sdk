package com.couchbase.tools.performer

enum Sdk {
    JAVA,
    SCALA,
    KOTLIN,
    CPP,
    DOTNET,
    PYTHON,
    RUBY,
    NODE,
    GO,
    PHP
}

class SdkSynonyms {
    public static Sdk sdk(String input) {
        if (isJava(input)) return Sdk.JAVA
        else if (isScala(input)) return Sdk.SCALA
        else if (isKotlin(input)) return Sdk.KOTLIN
        else if (isCpp(input)) return Sdk.CPP
        else if (isDotNet(input)) return Sdk.DOTNET
        else if (isPython(input)) return Sdk.PYTHON
        else if (isRuby(input)) return Sdk.RUBY
        else if (isNode(input)) return Sdk.NODE
        else if (isGo(input)) return Sdk.GO
        else if (isPHP(input)) return Sdk.PHP
        else throw new RuntimeException("Cannot parse SDK ${input}")
    }

    public static boolean isJava(String input) {
        // java-sdk used to refer to the couchbase-jvm-clients performer and "java" to the transactions-fit-performer
        // Java performer.  The latter only tests the separate transactions library and is now deprecated, plus was
        // never ported to Docker which is where this logic is used.  So now, we just accept "java".
        return input.equalsIgnoreCase("java-sdk") || input.equalsIgnoreCase("java")
    }

    public static boolean isScala(String input) {
        return input.equalsIgnoreCase("scala")
    }

    public static boolean isKotlin(String input) {
        return input.equalsIgnoreCase("kotlin")
    }

    public static boolean isCpp(String input) {
        return input.equalsIgnoreCase("c++") || input.equalsIgnoreCase("cxx") || input.equalsIgnoreCase("cpp")
    }

    public static boolean isDotNet(String input) {
        return input.equalsIgnoreCase(".net") || input.equalsIgnoreCase("dotnet")
    }

    public static boolean isPython(String input) {
        return input.equalsIgnoreCase("python")
    }

    public static boolean isRuby(String input) {
        return input.equalsIgnoreCase("ruby")
    }

    public static boolean isNode(String input) {
        return input.equalsIgnoreCase("node")
    }

    public static boolean isGo(String input) {
        input.equalsIgnoreCase("go")
    }

    public static boolean isPHP(String input) {
        return input.equalsIgnoreCase("php")
    }

}
