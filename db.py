import sqlite3

connect = sqlite3.connect('baza/list.db')
cursor = connect.cursor()

#Створити aдаптована таблиця з 1 колонкою
def db_plus1(name_table ,name1, type1):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""(""" + name1 + type1 + """) """)
    connect.commit()

#Створити aдаптована таблиця з 2 колонками
def db_plus2(name_table, name1, type1, name2, type2):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""(""" + name1 + type1 + """, """ + name2 + type2 + """) """)
    connect.commit()

#Створити базу даних для 3 колонок
def db_plus3(name_table, name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 4 колонок
def db_plus4(name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 5 колонок
def db_plus5(name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 6 колонок
def db_plus6(name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 7 колонок
def db_plus7(name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 8 колонок
def db_plus8(name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 9 колонок
def db_plus9(name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS expenses(name TEXT, last_name TEXT, id INT) """)
    connect.commit()

#Створити базу даних для 10 колонок
def db_plus10(name1, type1, name2, type2, name3, type3):
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