import sqlite3

connect = sqlite3.connect('baza/list.db')
cursor = connect.cursor()

#Створити базу даних
def db_plus():
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Видалити базу даних
def db_delete():
    cursor.execute("DROP TABLE expenses")
    connect.commit()

#Занести дані у базу даних
def insert_data_db(name_register, ba, c):
    main_list = [name_register, ba, c]
    cursor.execute("INSERT INTO expenses VALUES(?,?,?);", main_list)
    connect.commit()

#Винести дані з бази даних
def select_data_db():
    next_row = cursor.fetchone()
    if next_row:
        (a, b, c) = next_row
        return a, b, c
    else:
        return 0;

#Редагувати файл
def alter_data_db():
    return 0