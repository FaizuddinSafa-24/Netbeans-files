# Bug Report of Quiz1

## Original Code in TestProgram.java

```java
for(Attendee i : a) {
    i.displayConcertDetails();
}
```
## Changing To

```java
for(int i= 0; i <a.length; i++) {
    a[i].displayAttendeeInfo();
}
```

