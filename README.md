This project is used to learn how to inject custom properties

define a property as:
property.name.anything.else=valueOfProperty

Inject into a variable by the annotation:
@Value("${property.name.anything.else}")
