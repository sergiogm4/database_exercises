package edu.upc.eetac.dsa.meseguer.mysql;

import edu.upc.eetac.dsa.meseguer.mysql.MySQLAccess;

public class Main {
  public static void main(String[] args) throws Exception {
    MySQLAccess dao = new MySQLAccess();
    dao.readDataBase();
  }

} 