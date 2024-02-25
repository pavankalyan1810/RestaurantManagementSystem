//package org.Project.RestaurantManagementProject.initializers;
//
//import org.Project.RestaurantManagementProject.model.Table;
//import org.Project.RestaurantManagementProject.repository.TableRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//
//
//	
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    private final TableRepository tableRepository;
//
//    @Autowired
//    public DataInitializer(TableRepository tableRepository) {
//        this.tableRepository = tableRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        if (tableRepository.count() == 0) {
//            initializeTables();
//        }
//    }
//
//    private void initializeTables() {
//        for (int i = 1; i <= 50; i++) {
//            Table table = new Table();
//            table.setTableName("Table " + i);
//            tableRepository.save(table);
//        }
//    }
//}
//
//



