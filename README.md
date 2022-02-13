# DesignConferenceRoom

## DESIGN A CONFERENCE ROOM

One of the core problems which people face at every company is the unavailability of conference rooms. So we thought of building one conference room management system. The system should have the following features.

### **Assumptions**:

1. Conference rooms are scattered across multiple buildings and multiple floors and each floor can have multiple conference rooms, but each conference room should be uniquely identifiable.

2. Booking will be done for slots in hours. Hours will be taken in 24 hours format eg. Book from 1am to 3am {1:3}, from 12pm to 1pm {12:13}

3. Each conference room can be booked given that no one has already booked for that slot.

4. Booking can be done for a maximum of 12 hour.

### **Features**:

1. List down all the conference rooms available in any building. 

2. Users should be able to book a room for a particular slot if it’s valid and available.

3. Users should be able to cancel existing booking and rooms should be free to be booked again for that slot.

4. List down all the bookings.

### **Commands**:

**ADD BUILDING <building>** 

Eg: ADD BUILDING

Output: Added building b1 into the system.

**ADD FLOOR <building> <floor>**

Eg. ADD FLOOR b1 2

Output: Added floor 2 in building b1.

**ADD CONFROOM <building> <floor> <conferenceRoomID>**

Eg: ADD CONFROOM c1 1 b1

Output: Added conference room c1 in first floor of building b1.

List the available conference rooms:

**LIST ROOMS**

Ex : 

c1 1 b1 [{1:24}]

c2 2 b2 [{2:12}, {14:18}]

output Format :<conferenceRoomID> <floor> <building> <slots>

Books the given Conference room for a given slot, on the given floor of the building.

**BOOK <SLOT> <BUILDING> <FLOOR> <ROOM ID>**

Ex: BOOK 1:5 b1 7 C1

Cancels the slot booked for the floor in a given building.

**CANCEL <SLOT> <BUILDING> <FLOOR> <ROOM ID>**

List down all the bookings 

**LIST BOOKING <BUILDING> <FLOOR>**

Output format: <SLOT> <FLOOR> <BUILDING> <roomName>

Ex:

2:6 3 b1 c1

6:10 3 b1 c2

### **Expectation**

- Code should be Demo-able and functionally complete.
- Code should fail gracefully with a proper error message for corner/invalid cases, use exceptions for handling these cases.
- Code should be modular, try thinking in terms of Object-Oriented Design.
- Input can be taken from the command line or in the main function.
- Do not use any database or NoSQL store, use in-memory data structure.
- Do not create any UI for the application
- Driver class can be designed as per your choice, but it should cover all the scenarios.
- Please prioritise code compilation, execution, and completion.

  
# Output
1.  ![Output 1](https://github.com/ShubhamThakur139/DesignConfrenceRoom/blob/master/readmeImages/image1.png)
2.  ![Output 2](https://github.com/ShubhamThakur139/DesignConfrenceRoom/blob/master/readmeImages/image2.png)
3.  ![Output 3](https://github.com/ShubhamThakur139/DesignConfrenceRoom/blob/master/readmeImages/image3.png)

  
