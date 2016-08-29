## Behavior Driven Development BDD

Project Setup with

- Gradle with test tasks for "chrome", "phantomJs", "firefox" (only "chrome" works on Windows 10)
- Cucumber with [Gherkin Language (Feature / Scenario / Given / When / Then) .feature Files](https://github.com/cucumber/cucumber/wiki/Gherkin)
- Serenity BDD (previously known as Thucydides)
- AssertJ - Fluent Assertions for Java

## Run all Tests

`./gradlew test aggregate`

## Serenity BDD aggregated Testreport

is in folder `target\site\serenity` as HTML Report - open index.html

## Serenity BDD References

[An Introduction to BDD Test Automation with Serenity and Cucumber-JVM](http://thucydides.info/docs/articles/an-introduction-to-serenity-bdd-with-cucumber.html)

[An Introduction to BDD Test Automation with Serenity and JUnit](https://dzone.com/articles/introduction-bdd-test)

[Serenity BDD Reference Manual](http://www.thucydides.info/docs/serenity/)

[Serenity BDD Documentation](http://www.thucydides.info/#/documentation)

[Serenity BDD @ Github](https://github.com/serenity-bdd)

[Official Serenity BDD Blog](https://thucydides-webtests.com/)

## Cucumber References

[BDD Testing with Cucumber, Java and JUnit](http://www.hascode.com/2014/12/bdd-testing-with-cucumber-java-and-junit/)

[Cucumber - executable Specifications](https://cucumber.io/)

## Agile Glossary References

The [Given-When-Then](https://www.agilealliance.org/glossary/gwt/) formula is a template intended to guide the writing of acceptance tests for a User Story

## User Stories References

[Imperative vs Declarative Scenarios in User Stories](http://benmabey.com/2008/05/19/imperative-vs-declarative-scenarios-in-user-stories.html)

Imperative Style: Detailed Attributes in the Gherkin Description.

Declarative Style: Detailed Attributes in the Steps Implementation or the Library Implementation.

## BDD References

[The Truth about BDD](https://sites.google.com/site/unclebobconsultingllc/the-truth-about-bdd)

Clean Coder - GIVEN/WHEN/THEN is simply a state transition, and BDD is really just a way to describe a finite state machine.

## AssertJ References 

[AssertJ](http://joel-costigliola.github.io/assertj/) Fluent assertions for java

## Dependencies
- [net.serenity-bdd:serenity-core](https://bintray.com/serenity/maven/serenity-core)
- [net.serenity-bdd:serenity-junit](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-junit)
- [junit:junit](https://bintray.com/bintray/jcenter/junit%3Ajunit)
- [net.serenity-bdd:serenity-cucumber](https://bintray.com/serenity/maven/serenity-cucumber) Cucumber integration for the Serenity BDD reporting library
- [org.assertj:assertj-core](https://bintray.com/bintray/jcenter/org.assertj%3Aassertj-core)
