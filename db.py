import sqlite3

connect = sqlite3.connect('baza/list.db')
cursor = connect.cursor()

#Створити aдаптована таблиця з 1 колонкою
def db_plus(name1, type1):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(""" + name1 + type1 + """) """)
    connect.commit()

#Створити базу даних для 2
#def db_plus(type, ):
#    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
#    connect.commit()

#Створити базу даних для 3
def db_plus(type, ):
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

#Редагувати таблицю
def alter_data_db():
    return 0