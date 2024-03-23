import db ## бібліотека для бази даних

def print_hi():
    db.select_data_db(5)

if __name__ == '__main__':
    print_hi()
