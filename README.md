📘 `README.md`

```markdown
# Java Console Applications: Student Register, Juice Shop & Typing Stack

This repository contains simple Java-based console applications that demonstrate the use of key data structures like `HashMap`, `ArrayList`, and `Stack` in real-world inspired mini-projects.

🔸 1.Juice Shop Inventory (📁 JuiceShop.java)

A basic inventory system using `ArrayList<String>` to manage available juices.
 ✅ Features:
- Add juice
- Remove juice
- Buy a juice (by index)
- View available juices
- Check if a juice is available
 ▶️ Sample Menu:
1 to add
2 to remove
3 to buy
4 to display available
5 to check
0 to exit

---
🔸 2. Student Register (📁 StudentRegister.java)

A student registration system using `HashMap<String, Integer>` where:

- Key: Student Name
- Value: Roll Number

 ✅ Features:
- Add a new student
- Remove a student
- Get a student by name
- Get a student by roll number
- Check presence of student name/roll number
- View full register

▶️ Sample Menu:
1 to add a student
2 to remove a student
3 to get a student by name
4 to get a student by RollNumber
5 to check presence of a student name
6 to check presence of a student roll no
7 to show register
Any other key to exit


---
🔸 3. Typing Stack (📁 Type.java)

A simple text-typing simulator using `Stack<String>` that allows you to:

✅ Features:
- Add word
- Undo last word
- View current sentence

 ▶️ Sample Menu:
1 to add text
2 to undo
3 to view the current sentence

---

🔸 4. Bank Queue Simulation (📁 `bankQueue.java`)

A simple queue simulation using `LinkedList<String>` that imitates a queue system in a bank.

✅ Features:

* Add customer to the queue
* Serve (remove) the first customer
* Display the full queue
* Show the **nth** customer in the queue

▶️ Sample Menu:

```
Press 1 to add customer
Press 2 to serve customer
Press 3 to view the current queue
Press 4 to show nth customer
Any other key to exit
```
💡 Sample Output:

```
Enter name of the customer:
> Alice
********added********

Enter the QueueNumber to display the customer name:
> 1
Alice
```

---

You can insert this section right after the JuiceShop section in your `README.md`. Let me know if you'd like the full updated `README.md` including this!

💡 How to Run

1. Clone this repository or download the files.
2. Open the project in **IntelliJ IDEA**, **VS Code**, or any Java IDE.
3. Compile and run individual `.java` files depending on the program you want to test.

```bash
javac StudentRegister.java
java StudentRegister
````

Repeat the same for `JuiceShop` and `Type`.

---
 📚 Concepts Covered

* HashMap operations (put, get, contains, remove)
* ArrayList operations (add, remove, contains)
* Stack operations (push, pop, peek)
* LinkedList operations(addFirst, removeLast,get,contains)
* Loop and switch-case logic
* Console I/O using `Scanner`

---
🙌 Author

Created by Suruthi Rajeev as part of hands-on Java learning.

---

📌 License

This project is open-source and free to use for learning and academic purposes.


---

