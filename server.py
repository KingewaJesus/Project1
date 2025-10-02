import sqlite3

def init_db():
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS users (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT,
            email TEXT,
            password TEXT
        )
    """)
    conn.commit()
    conn.close()

def save_user(name, email, password):
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("INSERT INTO users (name, email, password) VALUES (?, ?, ?)",
                   (name, email, password))
    conn.commit()
    conn.close()
    print("✅ User saved successfully")

if __name__ == "__main__":
    init_db()

    # Simulate form data (since we can’t run Flask here)
    name = input("Enter your name: ")
    email = input("Enter your email: ")
    password = input("Enter your password: ")

    save_user(name, email, password)
