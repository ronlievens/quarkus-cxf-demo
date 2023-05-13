# quarkus-cxf-demo

This small quarkus cxf demo based
on: https://quarkiverse.github.io/quarkiverse-docs/quarkus-cxf/dev/user-guide/first-soap-web-service.html
In this demo the WSDL will be used to generate the sources (contract first).

When the demo is started:

- [Dev ui](http://localhost:8080/q/dev-ui/extensions)
- [CXF overvier](http://localhost:8080/soap/?wsdl)
- [Hello SOAP endpoint](http://localhost:8080/soap/HelloService?wsdl)

# Setup GraalVM 17 on Macos with Homebrew

source: https://codetinkering.com/install-graalvm-native-image-mac/

```shell
brew install --cask graalvm/tap/graalvm-ce-java17
```

Error `"graalvm-ce-java17-22.3.1" is damaged and can't be opened.`

Fix:

```shell
xattr -r -d com.apple.quarantine /Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.1 
```

Add to shell: ~/.zshrc

```shell
export JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.1/Contents/Home
export PATH=${PATH}:${JAVA_HOME}/bin
```

Installing the Native Image Plugin for GraalVM:

```shell
gu install native-image
```
