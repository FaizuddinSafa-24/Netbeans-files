# Bug Report of Quiz1: Original Code Was Encapsulation+ Inheritance

## Original Code in TestProgram.java

```java
for(Attendee i : a) {
    i.displayConcertDetails();
}
```
### Changing To

```java
for(int i= 0; i <a.length; i++) {
    a[i].displayAttendeeInfo();
    c[i].displayConcertDetails();
    System.out.println("");
}
```

## Original Code in Concert, Performer, Attendee
- [x] Completed all methods.
- [x] Removed **Unnecessary** *super* invoking.
- [x] Invoked **showPerformerInfo()** inside *displayConcertDetails()* method of Concert.java to **automate process**.