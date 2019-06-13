cd "$(dirname "$0")"

rm java8-okhttp-gson/pom.xml
rm java8-okhttp-gson/build.gradle
rm -r java8-okhttp-gson/src/main

rm java8-jersey2/pom.xml
rm java8-jersey2/build.gradle
rm -r java8-jersey2/src/main

rm java8-retrofit2/pom.xml
rm java8-retrofit2/build.gradle
rm java8-retrofit2/src/main

rm -r csharp-net35/src/Sphereon.SDK.Blockchain.Proof
rm -r csharp-net45/src/Sphereon.SDK.Blockchain.Proof

mvn -Pjava8-jersey2 clean install
mvn -Pjava8-okhttp-gson clean install
mvn -Pjava8-retrofit2 clean install
mvn -Pcsharp-net45 clean install
mvn -Pcsharp-net35 clean install
mvn -Pjavascript clean install
mvn -Ptypescript-angular clean install
mvn -Phtml-docs clean install
