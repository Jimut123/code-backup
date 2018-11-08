import sqlite3

class DBManager:
    def __init__(self,path_to_db):
        self.path = path_to_db
        self.conn = sqlite3.connect(self.path)
        self.cur = self.conn.cursor()
    def create_table(self,table_name, columns):
        query = "CREATE TABLE IF NOT EXISTS "+ table_name+"("
        for key,val in columns.items():
            query = query + key + " " + val+","
        query = query[:-1]
        query += ");"
        self.cur.executescript(query)
    def insert_data(self, table_name, data):
        query = "INSERT INTO "+table_name+" VALUES("
        for val in data:
            query += (str(val) + ",")
        query = query[:-1]
        query += ");"
        self.cur.executescript(query)

    def update_data(self,table_name, primary_key_col_name, primary_key, column_name, new_val, condition):
        query = "UPDATE TABLE " + table_name + " SET "+ column_name + " = "+new_val + " WHERE " + primary_key_col_name + "=" + str(primary_key) + " AND "+condition+";"
        self.cur.executescript(query)        

    def add_column(self,table_name,columns):
        query = "ALTER TABLE "+table_name+" ADD COLUMN "
        for key,val in columns.items():
            query += (key + " " + val + ",")
        query = query[:-1]
        query+=";"
        self.cur.executescript(query)

    def delete_column(self, table_name, columns):
       query = "ALTER TABLE " + table_name + " DROP COLUMN "
       for column in columns:
           self.cur.executescript(query + column +";")
    def select(self, table_name,columns, query_string):
        query = "SELECT " + ",".join(columns) + " FROM "+table_name + " WHERE " + query_string + ";"
        self.cur.executescript(query)

if __name__ == "__main__":
    #db = DBManager("test.sqlite")
    #db.insert_data("test",[1,"test","hello",4224])
    #db.update_data("test","sl_no",12,"name","abc.xyz","flat=20");
    #db.add_column("test",{ "email":"TEXT","month":"TEXT" })
    #db.delete_column("test",["name","mail"])
    #db.select("test",["mail","name"], "sl_no=20")
