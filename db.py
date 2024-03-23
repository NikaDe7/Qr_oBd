import sqlite3

connect = sqlite3.connect('baza/list.db')
cursor = connect.cursor()

#Створити aдаптовану таблицю з 1 колонкою
def db_plus1(name_table ,name1, type1):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""(""" + name1 + type1 + """) """)
    connect.commit()

#Створити aдаптовану таблицю з 2 колонкою
def db_plus2(name_table, name1, type1, name2, type2):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""("""
                   + name1 + type1 + """, """
                   + name2 + type2 + """) """)
    connect.commit()

#Створити адаптовану таблицю для 3 колонок
def db_plus3(name_table, name1, type1, name2, type2, name3, type3):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""("""
                   + name1 + type1 + """, """
                   + name2 + type2 + """, """
                   + name3 + type3 + """) """)
    connect.commit()

#Створити адаптовану таблицю для 4 колонок
def db_plus4(name_table, name1, type1, name2, type2, name3, type3, name4, type4):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""("""
                   + name1 + type1 + """, """
                   + name2 + type2 + """, """
                   + name3 + type3 + """, """
                   + name4 + type4 + """) """)
    connect.commit()

#Створити адаптовану таблицю для 5 колонок
def db_plus5(name_table, name1, type1, name2, type2, name3, type3, name4, type4, name5, type5):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""("""
                   + name1 + type1 + """, """
                   + name2 + type2 + """, """
                   + name3 + type3 + """, """
                   + name4 + type4 + """, """
                   + name5 + type5 + """) """)
    connect.commit()

#Створити адаптовану таблицю для 6 колонок
def db_plus6(name_table, name1, type1, name2, type2, name3, type3, name4, type4, name5, type5, name6, type6):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""("""
                   + name1 + type1 + """, """
                   + name2 + type2 + """, """
                   + name3 + type3 + """, """
                   + name4 + type4 + """, """
                   + name5 + type5 + """, """
                   + name6 + type6 + """) """)
    connect.commit()

#Створити адаптовану таблицю для 7 колонок
def db_plus6(name_table, name1, type1, name2, type2, name3, type3, name4, type4, name5, type5, name6, type6, name7, type7):
    cursor.execute(""" CREATE TABLE IF NOT EXISTS """+name_table+"""("""
                   + name1 + type1 + """, """
                   + name2 + type2 + """, """
                   + name3 + type3 + """, """
                   + name4 + type4 + """, """
                   + name5 + type5 + """, """
                   + name6 + type6 + """, """
                   + name7 + type7 + """) """)
    connect.commit()


#Видалити таблицю
def db_delete(name_table):
    cursor.execute("DROP TABLE "+name_table)
    connect.commit()

#Занести дані у таблицю
def insert_data_db(name_table, data_column, size_data_column):
    for i in size_data_column:
        if i==0:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?);", data_column)
        elif i==1:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?,?);", data_column)
        elif i==2:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?,?,?);", data_column)
        elif i==3:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?,?,?,?);", data_column)
        elif i==4:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?,?,?,?,?);", data_column)
        elif i==5:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?,?,?,?,?,?);", data_column)
        elif i==6:
            cursor.execute("INSERT INTO "+name_table+" VALUES(?,?,?,?,?,?,?);", data_column)
        else:
            return 0
    connect.commit()

#Винести всі дані з таблиці
def select_all_data_db(name_table):
    cursor.execute("SELECT * FROM "+name_table)
    connect.commit()

#Винести рядок з таблиці
def select_data_db(name_table, id_row, number_column):
    cursor.execute("SELECT * FROM"+name_table)
    while True:
        next_row = cursor.fetchone()
        if next_row:
            dict_data = {}
            for i in range(number_column):
                if i == number_column:
                    dict_data[i] = next_row

'''
    dict_data = {}
    for i in range(id_row):
        if i==id_row:
            dict_data[i] = []
'''
'''
    next_row = cursor.fetchone()
    if next_row:
        (a, b, c) = next_row
        return a, b, c
    else:
        return 0;
'''

#Редагувати таблицю
def alter_data_db():
    return 0