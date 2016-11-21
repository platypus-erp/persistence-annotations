#Persistence Annotation

This repository contains all the Java Annotation needed for the platypus framework.

This jar is still under **BETA** so possible radical change can be pushed

All the annotation are used in the repository [persistence-annotation-processor](https://github.com/platypus-erp/persistence-annotation-processor)

All annotation are not yet supported by the processor [processor Roadmap](https://github.com/platypus-erp/persistence-annotation-processor)

Annotation that will create field :

- [ ] ```java @UniqueKey```
- [ ] ```java @FetchLazy```
- [ ] ```java @Column```
- [ ] ```java @RelationManyToMany```
- [ ] ```java @RelationManyToOne```
- [ ] ```java @RelationOneToOne```
- [ ] ```java @RelationOneToMany```
- [ ] ```java @RelationManyToMany```

Annotations to customize JPA call back method

- [ ] ```java @OnPrePersist```
- [ ] ```java @OnPreUpdate```
- [ ] ```java @OnPreDelete```

##ROADMAP

- [ ] Support All Annotation mentioned in the list
- [ ] Add Documentation on each Annotation
- [ ] Add Snippet with code example
- [ ] Support more JPA Annotation