import java.sql.*;
import java.util.*;
import java.sql.Date;
import java.time.LocalDate;

class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/canteen_management_system";
    private static final String USER = "Add your User Name ";
    private static final String PASSWORD = "Add your password of sql server";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (Exception e) {
                System.out.println("Database connection failed: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("[INFO] Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private java.sql.Date registrationDate;
    private java.sql.Date birthDate;
    private String presentAddress;
    private String permanentAddress;
    private String role;

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(java.sql.Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

class MenuItem {
    private int itemId;
    private String itemName;
    private double price;
    private String availabilityStatus;
    private int preparationTime;
    private int categoryId;
    private String categoryName;
    private double averageRating;
    private int reviewCount;

    public MenuItem() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }
}

class Order {
    private int orderId;
    private java.sql.Date orderDate;
    private double totalAmount;
    private String orderStatus;
    private String paymentMethod;
    private int userId;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public java.sql.Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

class OrderItem {
    private int orderItemId;
    private int quantity;
    private double itemPrice;
    private int itemId;
    private int orderId;

    public OrderItem() {
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

class Inventory {
    private int inventoryId;
    private String itemName;
    private int quantity;
    private String unit;

    public Inventory() {
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

class Staff {
    private double salary;
    private int workingHour;
    private int userId;

    public Staff() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

class SalesReport {
    private Date saleDate;
    private int totalOrders;
    private double totalRevenue;
    private double avgOrderValue;

    public SalesReport() {
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getAvgOrderValue() {
        return avgOrderValue;
    }

    public void setAvgOrderValue(double avgOrderValue) {
        this.avgOrderValue = avgOrderValue;
    }
}

class Recipe {
    private int recipeId;
    private int itemId;
    private String itemName;
    private List<RecipeIngredient> ingredients;

    public Recipe() {
        ingredients = new ArrayList<>();
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }
}

class RecipeIngredient {
    private int recipeId;
    private int inventoryId;
    private String inventoryName;
    private int quantityReq;
    private String unit;

    public RecipeIngredient() {
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public int getQuantityReq() {
        return quantityReq;
    }

    public void setQuantityReq(int quantityReq) {
        this.quantityReq = quantityReq;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

class Review {
    private int reviewId;
    private double rating;
    private String comment;
    private int userId;
    private String userName;
    private int itemId;
    private String itemName;

    public Review() {
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

// ==================== DAO CLASSES ====================
class CanteenMenuDAO {
    public List<MenuItem> getAllMenuItems() throws SQLException {
        List<MenuItem> menuItems = new ArrayList<>();
        String query = "SELECT m.*, c.Category_Name_, COALESCE(AVG(r.Rating), 0) as AvgRating, COUNT(r.Review_ID) as ReviewCount "
                +
                "FROM Menu_Item_ m JOIN Category c ON m.Category_ID_ = c.Category_ID_ " +
                "LEFT JOIN Review r ON m.Item_ID = r.Item_ID " +
                "WHERE m.Availability_Status = 'Available' GROUP BY m.Item_ID";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                MenuItem item = new MenuItem();
                item.setItemId(rs.getInt("Item_ID"));
                item.setItemName(rs.getString("Item_Name_"));
                item.setPrice(rs.getDouble("Price_"));
                item.setAvailabilityStatus(rs.getString("Availability_Status"));
                item.setPreparationTime(rs.getInt("Preparation_Time"));
                item.setCategoryId(rs.getInt("Category_ID_"));
                item.setCategoryName(rs.getString("Category_Name_"));
                item.setAverageRating(rs.getDouble("AvgRating"));
                item.setReviewCount(rs.getInt("ReviewCount"));
                menuItems.add(item);
            }
        }
        return menuItems;
    }

    public void addMenuItem(MenuItem item) throws SQLException {
        String query = "INSERT INTO Menu_Item_ (Item_ID, Item_Name_, Price_, Availability_Status, Preparation_Time, Category_ID_) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, item.getItemId());
            pstmt.setString(2, item.getItemName());
            pstmt.setDouble(3, item.getPrice());
            pstmt.setString(4, item.getAvailabilityStatus());
            pstmt.setInt(5, item.getPreparationTime());
            pstmt.setInt(6, item.getCategoryId());
            pstmt.executeUpdate();
            System.out.println("[OK] Menu item added to canteen!");
        }
    }

    public MenuItem getMenuItemById(int id) throws SQLException {
        String query = "SELECT m.*, c.Category_Name_ FROM Menu_Item_ m JOIN Category c ON m.Category_ID_ = c.Category_ID_ WHERE m.Item_ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                MenuItem item = new MenuItem();
                item.setItemId(rs.getInt("Item_ID"));
                item.setItemName(rs.getString("Item_Name_"));
                item.setPrice(rs.getDouble("Price_"));
                item.setAvailabilityStatus(rs.getString("Availability_Status"));
                item.setPreparationTime(rs.getInt("Preparation_Time"));
                item.setCategoryId(rs.getInt("Category_ID_"));
                item.setCategoryName(rs.getString("Category_Name_"));
                return item;
            }
        }
        return null;
    }

    public List<Object[]> getTopSellingItems(int limit) throws SQLException {
        List<Object[]> topItems = new ArrayList<>();
        String query = "SELECT m.Item_Name_, SUM(oi.Quantity) as TotalSold, SUM(oi.Quantity * oi.Item_price) as Revenue "
                +
                "FROM Order_Item oi JOIN Menu_Item_ m ON oi.Item_ID = m.Item_ID " +
                "GROUP BY m.Item_ID ORDER BY TotalSold DESC LIMIT ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, limit);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("Item_Name_");
                row[1] = rs.getInt("TotalSold");
                row[2] = rs.getDouble("Revenue");
                topItems.add(row);
            }
        }
        return topItems;
    }
}

class CanteenOrderDAO {
    public int createOrder(Order order) throws SQLException {
        String getMaxIdQuery = "SELECT MAX(Order_ID) FROM Orders";
        int nextOrderId = 1;
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(getMaxIdQuery)) {
            if (rs.next() && rs.getInt(1) > 0) {
                nextOrderId = rs.getInt(1) + 1;
            }
        }
        String query = "INSERT INTO Orders (Order_ID, Order_Date_, Total_Amount, Order_Status, Payment_Method, ID) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, nextOrderId);
            pstmt.setDate(2, order.getOrderDate());
            pstmt.setDouble(3, order.getTotalAmount());
            pstmt.setString(4, order.getOrderStatus());
            pstmt.setString(5, order.getPaymentMethod());
            pstmt.setInt(6, order.getUserId());
            pstmt.executeUpdate();
            return nextOrderId;
        }
    }

    public void addOrderItem(OrderItem orderItem) throws SQLException {
        String query = "INSERT INTO Order_Item (OrderItem_ID, Quantity, Item_price, Item_ID, Order_ID) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, orderItem.getOrderItemId());
            pstmt.setInt(2, orderItem.getQuantity());
            pstmt.setDouble(3, orderItem.getItemPrice());
            pstmt.setInt(4, orderItem.getItemId());
            pstmt.setInt(5, orderItem.getOrderId());
            pstmt.executeUpdate();
        }
    }

    public List<Order> getOrdersByUser(int userId) throws SQLException {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM Orders WHERE ID = ? ORDER BY Order_Date_ DESC";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getInt("Order_ID"));
                order.setOrderDate(rs.getDate("Order_Date_"));
                order.setTotalAmount(rs.getDouble("Total_Amount"));
                order.setOrderStatus(rs.getString("Order_Status"));
                order.setPaymentMethod(rs.getString("Payment_Method"));
                order.setUserId(rs.getInt("ID"));
                orders.add(order);
            }
        }
        return orders;
    }

    public void updateOrderStatus(int orderId, String status) throws SQLException {
        String query = "UPDATE Orders SET Order_Status = ? WHERE Order_ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setString(1, status);
            pstmt.setInt(2, orderId);
            pstmt.executeUpdate();
        }
    }

    public List<Object[]> getAllOrdersWithCustomer() throws SQLException {
        List<Object[]> orders = new ArrayList<>();
        String query = "SELECT o.Order_ID, o.Order_Date_, o.Total_Amount, o.Order_Status, o.Payment_Method, u.Name " +
                "FROM Orders o JOIN Users u ON o.ID = u.ID ORDER BY o.Order_Date_ DESC";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("Order_ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getDate("Order_Date_");
                row[3] = rs.getDouble("Total_Amount");
                row[4] = rs.getString("Order_Status");
                row[5] = rs.getString("Payment_Method");
                orders.add(row);
            }
        }
        return orders;
    }
}

class InventoryDAO {
    public List<Inventory> getAllInventory() throws SQLException {
        List<Inventory> inventoryList = new ArrayList<>();
        String query = "SELECT * FROM Inventory";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Inventory inv = new Inventory();
                inv.setInventoryId(rs.getInt("Inventory_ID_"));
                inv.setItemName(rs.getString("Item_Name"));
                inv.setQuantity(rs.getInt("Quantity_"));
                inv.setUnit(rs.getString("Unit"));
                inventoryList.add(inv);
            }
        }
        return inventoryList;
    }

    public void updateInventory(int inventoryId, int newQuantity) throws SQLException {
        if (newQuantity < 0) {
            System.out.println("   [ERROR] Quantity cannot be negative!");
            return;
        }
        String query = "UPDATE Inventory SET Quantity_ = ? WHERE Inventory_ID_ = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, newQuantity);
            pstmt.setInt(2, inventoryId);
            pstmt.executeUpdate();
            System.out.println("   [OK] Inventory updated!");
        }
    }

    public void deductStock(int inventoryId, int quantity) throws SQLException {
        String query = "UPDATE Inventory SET Quantity_ = Quantity_ - ? WHERE Inventory_ID_ = ? AND Quantity_ >= ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, quantity);
            pstmt.setInt(2, inventoryId);
            pstmt.setInt(3, quantity);
            int rows = pstmt.executeUpdate();
            if (rows == 0) {
                System.out.println("   [ERROR] Insufficient stock for item ID: " + inventoryId);
            }
        }
    }

    public List<Inventory> getLowStockItems() throws SQLException {
        List<Inventory> lowStock = new ArrayList<>();
        String query = "SELECT * FROM Inventory WHERE Quantity_ < 50 ORDER BY Quantity_ ASC";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Inventory inv = new Inventory();
                inv.setInventoryId(rs.getInt("Inventory_ID_"));
                inv.setItemName(rs.getString("Item_Name"));
                inv.setQuantity(rs.getInt("Quantity_"));
                inv.setUnit(rs.getString("Unit"));
                lowStock.add(inv);
            }
        }
        return lowStock;
    }
}

class StaffDAO {
    public void addStaff(Staff staff) throws SQLException {
        String query = "INSERT INTO Staff (Salary, Working_Hour, ID) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setDouble(1, staff.getSalary());
            pstmt.setInt(2, staff.getWorkingHour());
            pstmt.setInt(3, staff.getUserId());
            pstmt.executeUpdate();
            System.out.println("[OK] Staff member added!");
        }
    }

    public List<Staff> getAllStaff() throws SQLException {
        List<Staff> staffList = new ArrayList<>();
        String query = "SELECT * FROM Staff";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setSalary(rs.getDouble("Salary"));
                staff.setWorkingHour(rs.getInt("Working_Hour"));
                staff.setUserId(rs.getInt("ID"));
                staffList.add(staff);
            }
        }
        return staffList;
    }

    public List<Object[]> getStaffWithDetails() throws SQLException {
        List<Object[]> staffDetails = new ArrayList<>();
        String query = "SELECT s.ID, u.Name, s.Salary, s.Working_Hour, u.Email, up.Phone " +
                "FROM Staff s JOIN Users u ON s.ID = u.ID LEFT JOIN Users_Phone up ON u.ID = up.ID";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getDouble("Salary");
                row[3] = rs.getInt("Working_Hour");
                row[4] = rs.getString("Email");
                row[5] = rs.getString("Phone");
                staffDetails.add(row);
            }
        }
        return staffDetails;
    }
}

class CanteenUserDAO {
    public boolean registerUser(User user) throws SQLException {
        String query = "INSERT INTO Users (ID, Name, Password, Email, Registration_Date_, Birth_Date_, Present_Address, Permanent_Address, Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getEmail());
            pstmt.setDate(5, user.getRegistrationDate());
            pstmt.setDate(6, user.getBirthDate());
            pstmt.setString(7, user.getPresentAddress());
            pstmt.setString(8, user.getPermanentAddress());
            pstmt.setString(9, user.getRole());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean isIdExists(int id) throws SQLException {
        String query = "SELECT * FROM Users WHERE ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        }
    }

    public User loginUser(int id, String password) throws SQLException {
        String query = "SELECT * FROM Users WHERE ID = ? AND Password = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                user.setRegistrationDate(rs.getDate("Registration_Date_"));
                user.setBirthDate(rs.getDate("Birth_Date_"));
                user.setPresentAddress(rs.getString("Present_Address"));
                user.setPermanentAddress(rs.getString("Permanent_Address"));
                user.setRole(rs.getString("Role"));
                return user;
            }
        }
        return null;
    }

    public void addPhone(int userId, String phone) throws SQLException {
        String query = "INSERT INTO Users_Phone (Phone, ID) VALUES (?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setString(1, phone);
            pstmt.setInt(2, userId);
            pstmt.executeUpdate();
            System.out.println("[OK] Phone number added!");
        }
    }

    public Object[] getUserOrderSummary(int userId) throws SQLException {
        Object[] summary = new Object[4];
        String query = "SELECT COUNT(*) as TotalOrders, SUM(Total_Amount) as TotalSpent, AVG(Total_Amount) as AvgSpent, MAX(Total_Amount) as MaxSpent FROM Orders WHERE ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                summary[0] = rs.getInt("TotalOrders");
                summary[1] = rs.getDouble("TotalSpent");
                summary[2] = rs.getDouble("AvgSpent");
                summary[3] = rs.getDouble("MaxSpent");
            }
        }
        return summary;
    }
}

class SalesDAO {
    public List<SalesReport> getDailySalesReport(Date startDate, Date endDate) throws SQLException {
        List<SalesReport> reports = new ArrayList<>();
        String query = "SELECT Order_Date_, COUNT(*) as TotalOrders, SUM(Total_Amount) as Revenue, AVG(Total_Amount) as AvgOrder "
                +
                "FROM Orders WHERE Order_Date_ BETWEEN ? AND ? AND Order_Status = 'Served' " +
                "GROUP BY Order_Date_ ORDER BY Order_Date_ DESC";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setDate(1, startDate);
            pstmt.setDate(2, endDate);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                SalesReport report = new SalesReport();
                report.setSaleDate(rs.getDate("Order_Date_"));
                report.setTotalOrders(rs.getInt("TotalOrders"));
                report.setTotalRevenue(rs.getDouble("Revenue"));
                report.setAvgOrderValue(rs.getDouble("AvgOrder"));
                reports.add(report);
            }
        }
        return reports;
    }

    public List<Object[]> getPaymentMethodStats() throws SQLException {
        List<Object[]> stats = new ArrayList<>();
        String query = "SELECT Payment_Method, COUNT(*) as UsageCount, SUM(Total_Amount) as TotalAmount FROM Orders GROUP BY Payment_Method ORDER BY UsageCount DESC";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("Payment_Method");
                row[1] = rs.getInt("UsageCount");
                row[2] = rs.getDouble("TotalAmount");
                stats.add(row);
            }
        }
        return stats;
    }
}

class RecipeDAO {
    public List<Recipe> getAllRecipes() throws SQLException {
        List<Recipe> recipes = new ArrayList<>();
        String query = "SELECT DISTINCT r.Recipe_ID, r.Item_ID, m.Item_Name_ FROM Recipe r JOIN Menu_Item_ m ON r.Item_ID = m.Item_ID";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Recipe recipe = new Recipe();
                recipe.setRecipeId(rs.getInt("Recipe_ID"));
                recipe.setItemId(rs.getInt("Item_ID"));
                recipe.setItemName(rs.getString("Item_Name_"));
                recipe.setIngredients(getIngredientsByRecipeId(recipe.getRecipeId()));
                recipes.add(recipe);
            }
        }
        return recipes;
    }

    public List<RecipeIngredient> getIngredientsByRecipeId(int recipeId) throws SQLException {
        List<RecipeIngredient> ingredients = new ArrayList<>();
        String query = "SELECT ri.*, i.Item_Name FROM Recipe_Ingredient ri JOIN Inventory i ON ri.Inventory_ID_ = i.Inventory_ID_ WHERE ri.Recipe_ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, recipeId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                RecipeIngredient ing = new RecipeIngredient();
                ing.setRecipeId(rs.getInt("Recipe_ID"));
                ing.setInventoryId(rs.getInt("Inventory_ID_"));
                ing.setInventoryName(rs.getString("Item_Name"));
                ing.setQuantityReq(rs.getInt("Quantity_Req"));
                ing.setUnit(rs.getString("Unit"));
                ingredients.add(ing);
            }
        }
        return ingredients;
    }

    public Recipe getRecipeByItemId(int itemId) throws SQLException {
        String query = "SELECT r.Recipe_ID, r.Item_ID, m.Item_Name_ FROM Recipe r JOIN Menu_Item_ m ON r.Item_ID = m.Item_ID WHERE r.Item_ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, itemId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Recipe recipe = new Recipe();
                recipe.setRecipeId(rs.getInt("Recipe_ID"));
                recipe.setItemId(rs.getInt("Item_ID"));
                recipe.setItemName(rs.getString("Item_Name_"));
                recipe.setIngredients(getIngredientsByRecipeId(recipe.getRecipeId()));
                return recipe;
            }
        }
        return null;
    }

    public boolean checkRecipeStock(int itemId, int quantity) throws SQLException {
        Recipe recipe = getRecipeByItemId(itemId);
        if (recipe == null)
            return true;
        for (RecipeIngredient ing : recipe.getIngredients()) {
            String query = "SELECT Quantity_ FROM Inventory WHERE Inventory_ID_ = ?";
            try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
                pstmt.setInt(1, ing.getInventoryId());
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    int available = rs.getInt("Quantity_");
                    int required = ing.getQuantityReq() * quantity;
                    if (available < required) {
                        System.out.println("   [ERROR] Insufficient: " + ing.getInventoryName() + " (Need: " + required
                                + " " + ing.getUnit() + ", Available: " + available + ")");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void deductRecipeStock(int itemId, int quantity) throws SQLException {
        Recipe recipe = getRecipeByItemId(itemId);
        if (recipe == null)
            return;
        for (RecipeIngredient ing : recipe.getIngredients()) {
            int required = ing.getQuantityReq() * quantity;
            String query = "UPDATE Inventory SET Quantity_ = Quantity_ - ? WHERE Inventory_ID_ = ? AND Quantity_ >= ?";
            try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
                pstmt.setInt(1, required);
                pstmt.setInt(2, ing.getInventoryId());
                pstmt.setInt(3, required);
                pstmt.executeUpdate();
            }
        }
    }
}

class ReviewDAO {
    public void addReview(Review review) throws SQLException {
        int nextId = getNextReviewId();
        String query = "INSERT INTO Review (Review_ID, Rating, Comment, ID, Item_ID) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, nextId);
            pstmt.setDouble(2, review.getRating());
            pstmt.setString(3, review.getComment());
            pstmt.setInt(4, review.getUserId());
            pstmt.setInt(5, review.getItemId());
            pstmt.executeUpdate();
            System.out.println("   [OK] Review added successfully!");
        }
    }

    private int getNextReviewId() throws SQLException {
        String query = "SELECT MAX(Review_ID) FROM Review";
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next() && rs.getInt(1) > 0) {
                return rs.getInt(1) + 1;
            }
        }
        return 1;
    }

    public List<Review> getReviewsByItem(int itemId) throws SQLException {
        List<Review> reviews = new ArrayList<>();
        String query = "SELECT r.*, u.Name as UserName, m.Item_Name_ FROM Review r JOIN Users u ON r.ID = u.ID JOIN Menu_Item_ m ON r.Item_ID = m.Item_ID WHERE r.Item_ID = ? ORDER BY r.Review_ID DESC";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, itemId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Review review = new Review();
                review.setReviewId(rs.getInt("Review_ID"));
                review.setRating(rs.getDouble("Rating"));
                review.setComment(rs.getString("Comment"));
                review.setUserId(rs.getInt("ID"));
                review.setUserName(rs.getString("UserName"));
                review.setItemId(rs.getInt("Item_ID"));
                review.setItemName(rs.getString("Item_Name_"));
                reviews.add(review);
            }
        }
        return reviews;
    }

    public double getAverageRating(int itemId) throws SQLException {
        String query = "SELECT AVG(Rating) as AvgRating FROM Review WHERE Item_ID = ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, itemId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("AvgRating");
            }
        }
        return 0;
    }

    public List<Object[]> getTopRatedItems(int limit) throws SQLException {
        List<Object[]> topRated = new ArrayList<>();
        String query = "SELECT m.Item_ID, m.Item_Name_, AVG(r.Rating) as AvgRating, COUNT(r.Review_ID) as ReviewCount FROM Menu_Item_ m LEFT JOIN Review r ON m.Item_ID = r.Item_ID GROUP BY m.Item_ID ORDER BY AvgRating DESC LIMIT ?";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, limit);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getInt("Item_ID");
                row[1] = rs.getString("Item_Name_");
                row[2] = rs.getDouble("AvgRating");
                row[3] = rs.getInt("ReviewCount");
                topRated.add(row);
            }
        }
        return topRated;
    }
}

// ==================== MAIN CANTEEN APPLICATION ====================
public class CanteenManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static User currentUser = null;
    private static SalesDAO salesDAO = new SalesDAO();
    private static RecipeDAO recipeDAO = new RecipeDAO();
    private static ReviewDAO reviewDAO = new ReviewDAO();

    private static CanteenMenuDAO menuDAO = new CanteenMenuDAO();
    private static CanteenOrderDAO orderDAO = new CanteenOrderDAO();
    private static InventoryDAO inventoryDAO = new InventoryDAO();
    private static StaffDAO staffDAO = new StaffDAO();
    private static CanteenUserDAO userDAO = new CanteenUserDAO();

    public static void main(String[] args) {
        while (true) {
            if (currentUser == null) {
                showLoginMenu();
            } else {
                if (currentUser.getRole().equalsIgnoreCase("admin")) {
                    showAdminMenu();
                } else if (currentUser.getRole().equalsIgnoreCase("staff")) {
                    showStaffMenu();
                } else {
                    showCustomerMenu();
                }
            }
        }
    }

    private static void pressEnterToContinue() {
        System.out.print("\n   Press Enter to continue...");
        scanner.nextLine();
    }

    private static void showLoginMenu() {
        System.out.println("\n========================================");
        System.out.println("           CANTEEN LOGIN");
        System.out.println("========================================");
        System.out.println("   1. Login");
        System.out.println("   2. Register New Customer");
        System.out.println("   3. Exit");
        System.out.println("========================================");
        System.out.print("   Choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        try {
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register("customer");
                    break;
                case 3:
                    DatabaseConnection.closeConnection();
                    System.out.println("\n========================================");
                    System.out.println("   Thank you for using our system!");
                    System.out.println("   Goodbye!");
                    System.out.println("========================================\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("   [ERROR] Invalid choice!");
                    pressEnterToContinue();
            }
        } catch (SQLException e) {
            System.out.println("   [ERROR] Database error: " + e.getMessage());
            pressEnterToContinue();
        }
    }

    private static void showCustomerMenu() {
        System.out.println("\n========================================");
        System.out.println("           CUSTOMER MENU");
        System.out.println("========================================");
        System.out.println("   Welcome: " + currentUser.getName());
        System.out.println("----------------------------------------");
        System.out.println("   1. View Canteen Menu");
        System.out.println("   2. Place Order");
        System.out.println("   3. My Order History");
        System.out.println("   4. Add Review");
        System.out.println("   5. View Item Reviews");
        System.out.println("   6. My Profile");
        System.out.println("   7. My Order Summary");
        System.out.println("   8. Logout");
        System.out.println("----------------------------------------");
        System.out.print("   Choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        try {
            switch (choice) {
                case 1:
                    viewMenu();
                    pressEnterToContinue();
                    break;
                case 2:
                    placeOrder();
                    pressEnterToContinue();
                    break;
                case 3:
                    viewMyOrders();
                    pressEnterToContinue();
                    break;
                case 4:
                    addReview();
                    pressEnterToContinue();
                    break;
                case 5:
                    viewItemReviews();
                    pressEnterToContinue();
                    break;
                case 6:
                    viewProfile();
                    pressEnterToContinue();
                    break;
                case 7:
                    viewMyOrderSummary();
                    pressEnterToContinue();
                    break;
                case 8:
                    currentUser = null;
                    System.out.println("----------------------------------------");
                    System.out.println("   [OK] Logged out!");
                    System.out.println("========================================");
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("   [ERROR] Invalid choice!");
                    System.out.println("========================================");
                    pressEnterToContinue();
            }
        } catch (SQLException e) {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] Database error: " + e.getMessage());
            System.out.println("========================================");
            pressEnterToContinue();
        }
    }

    private static void showStaffMenu() {
        System.out.println("\n========================================");
        System.out.println("             STAFF MENU");
        System.out.println("========================================");
        System.out.println("   Staff: " + currentUser.getName());
        System.out.println("----------------------------------------");
        System.out.println("   1. View Menu");
        System.out.println("   2. View Inventory");
        System.out.println("   3. View All Orders");
        System.out.println("   4. Update Order Status");
        System.out.println("   5. View Low Stock Items");
        System.out.println("   6. View Recipes");
        System.out.println("   7. My Profile");
        System.out.println("   8. Logout");
        System.out.println("----------------------------------------");
        System.out.print("   Choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        try {
            switch (choice) {
                case 1:
                    viewMenu();
                    pressEnterToContinue();
                    break;
                case 2:
                    viewInventory();
                    pressEnterToContinue();
                    break;
                case 3:
                    viewAllOrders();
                    pressEnterToContinue();
                    break;
                case 4:
                    updateOrderStatus();
                    pressEnterToContinue();
                    break;
                case 5:
                    viewLowStockItems();
                    pressEnterToContinue();
                    break;
                case 6:
                    viewRecipes();
                    pressEnterToContinue();
                    break;
                case 7:
                    viewProfile();
                    pressEnterToContinue();
                    break;
                case 8:
                    currentUser = null;
                    System.out.println("----------------------------------------");
                    System.out.println("   [OK] Logged out!");
                    System.out.println("========================================");
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("   [ERROR] Invalid choice!");
                    System.out.println("========================================");
                    pressEnterToContinue();
            }
        } catch (SQLException e) {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] Database error: " + e.getMessage());
            System.out.println("========================================");
            pressEnterToContinue();
        }
    }

    private static void showAdminMenu() {
        System.out.println("\n========================================");
        System.out.println("             ADMIN MENU");
        System.out.println("========================================");
        System.out.println("   Admin: " + currentUser.getName());
        System.out.println("----------------------------------------");
        System.out.println("   1. Manage Menu");
        System.out.println("   2. Manage Inventory");
        System.out.println("   3. Manage Staff");
        System.out.println("   4. View All Orders");
        System.out.println("   5. Sales Report");
        System.out.println("   6. Top Selling Items");
        System.out.println("   7. Top Rated Items");
        System.out.println("   8. Payment Method Statistics");
        System.out.println("   9. View Recipes");
        System.out.println("   10. My Profile");
        System.out.println("   11. Logout");
        System.out.println("----------------------------------------");
        System.out.print("   Choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        try {
            switch (choice) {
                case 1:
                    manageMenu();
                    pressEnterToContinue();
                    break;
                case 2:
                    manageInventory();
                    pressEnterToContinue();
                    break;
                case 3:
                    manageStaff();
                    pressEnterToContinue();
                    break;
                case 4:
                    viewAllOrders();
                    pressEnterToContinue();
                    break;
                case 5:
                    salesReport();
                    pressEnterToContinue();
                    break;
                case 6:
                    viewTopSellingItems();
                    pressEnterToContinue();
                    break;
                case 7:
                    viewTopRatedItems();
                    pressEnterToContinue();
                    break;
                case 8:
                    viewPaymentMethodStats();
                    pressEnterToContinue();
                    break;
                case 9:
                    viewRecipes();
                    pressEnterToContinue();
                    break;
                case 10:
                    viewProfile();
                    pressEnterToContinue();
                    break;
                case 11:
                    currentUser = null;
                    System.out.println("----------------------------------------");
                    System.out.println("   [OK] Logged out!");
                    System.out.println("========================================");
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("   [ERROR] Invalid choice!");
                    System.out.println("========================================");
                    pressEnterToContinue();
            }
        } catch (SQLException e) {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] Database error: " + e.getMessage());
            System.out.println("========================================");
            pressEnterToContinue();
        }
    }

    private static void login() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("                 LOGIN");
        System.out.println("========================================");
        System.out.print("   ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("   Password: ");
        String password = scanner.nextLine();
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;
        int expectedResult = x + y;
        System.out.println("----------------------------------------");
        System.out.printf("   Security Check: %d + %d = ?\n", x, y);
        System.out.print("   Answer: ");
        int userAnswer = scanner.nextInt();
        scanner.nextLine();
        if (userAnswer != expectedResult) {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] Security check failed!");
            System.out.println("========================================");
            pressEnterToContinue();
            return;
        }
        User user = userDAO.loginUser(ID, password);
        if (user != null) {
            currentUser = user;
            System.out.println("----------------------------------------");
            System.out.println("   [OK] Welcome " + user.getName() + "!");
            System.out.println("   [OK] Role: " + user.getRole().toUpperCase());
            System.out.println("========================================");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] Invalid ID or password!");
            System.out.println("========================================");
        }
        pressEnterToContinue();
    }

    private static void register(String Role) throws SQLException {
        System.out.println("\n========================================");
        System.out.println("              REGISTRATION");
        System.out.println("========================================");
        User user = new User();
        System.out.print("   ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (userDAO.isIdExists(id)) {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] ID already exists!");
            System.out.println("========================================");
            pressEnterToContinue();
            return;
        }
        user.setId(id);
        System.out.print("   Name: ");
        user.setName(scanner.nextLine());
        System.out.print("   Email: ");
        user.setEmail(scanner.nextLine());
        System.out.print("   Password: ");
        user.setPassword(scanner.nextLine());
        System.out.print("   Birth Date (YYYY-MM-DD): ");
        user.setBirthDate(Date.valueOf(scanner.nextLine()));
        System.out.print("   Present Address: ");
        user.setPresentAddress(scanner.nextLine());
        System.out.print("   Permanent Address: ");
        user.setPermanentAddress(scanner.nextLine());
        user.setRole(Role);
        user.setRegistrationDate(new Date(System.currentTimeMillis()));
        if (userDAO.registerUser(user)) {
            System.out.println("----------------------------------------");
            System.out.println("   [OK] " + Role + " registered successfully!");
            System.out.print("   Phone number: ");
            String phone = scanner.nextLine();
            userDAO.addPhone(user.getId(), phone);
            System.out.println("========================================");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] Registration failed!");
            System.out.println("========================================");
        }
        pressEnterToContinue();
    }

    private static void viewMenu() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("             CANTEEN MENU");
        System.out.println("========================================");
        List<MenuItem> menuItems = menuDAO.getAllMenuItems();
        if (menuItems.isEmpty()) {
            System.out.println("   [INFO] No items available.");
        } else {
            System.out.printf("   %-5s %-25s %-8s %-15s %-8s %-10s%n", "ID", "Item Name", "Price", "Category", "Rating",
                    "Prep Time");
            System.out.println("   -----------------------------------------------------------------");
            for (MenuItem item : menuItems) {
                String ratingDisplay = item.getAverageRating() > 0 ? String.format("%.1f/5", item.getAverageRating())
                        : "No ratings";
                System.out.printf("   %-5d %-25s $%-7.2f %-15s %-8s %-10d min%n",
                        item.getItemId(),
                        truncate(item.getItemName(), 25),
                        item.getPrice(),
                        truncate(item.getCategoryName(), 15),
                        ratingDisplay,
                        item.getPreparationTime());
            }
        }
        System.out.println("========================================");
    }

    private static void viewMyOrderSummary() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("          MY ORDER SUMMARY");
        System.out.println("========================================");
        Object[] summary = userDAO.getUserOrderSummary(currentUser.getId());
        System.out.println("   Total Orders: " + summary[0]);
        System.out.println("   Total Spent: $" + summary[1]);
        System.out.println("   Average Order Value: $" + summary[2]);
        System.out.println("   Highest Order: $" + summary[3]);
        System.out.println("========================================");
    }

    private static void viewLowStockItems() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("          LOW STOCK ITEMS");
        System.out.println("========================================");
        List<Inventory> lowStock = inventoryDAO.getLowStockItems();
        if (lowStock.isEmpty()) {
            System.out.println("   [INFO] No low stock items found.");
        } else {
            System.out.printf("   %-15s %-30s %-10s %-10s%n", "ID", "Item Name", "Quantity", "Unit");
            System.out.println("   --------------------------------------------------------");
            for (Inventory inv : lowStock) {
                System.out.printf("   %-15d %-30s %-10d %-10s%n",
                        inv.getInventoryId(),
                        truncate(inv.getItemName(), 30),
                        inv.getQuantity(),
                        inv.getUnit());
            }
        }
        System.out.println("========================================");
    }

    private static void viewTopSellingItems() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("          TOP SELLING ITEMS");
        System.out.println("========================================");
        List<Object[]> topItems = menuDAO.getTopSellingItems(10);
        if (topItems.isEmpty()) {
            System.out.println("   [INFO] No sales data available.");
        } else {
            System.out.printf("   %-30s %-10s %-15s%n", "Item Name", "Quantity", "Revenue");
            System.out.println("   --------------------------------------------------------");
            for (Object[] item : topItems) {
                System.out.printf("   %-30s %-10d $%-14.2f%n",
                        truncate((String) item[0], 30),
                        (int) item[1],
                        (double) item[2]);
            }
        }
        System.out.println("========================================");
    }

    private static void viewTopRatedItems() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("          TOP RATED ITEMS");
        System.out.println("========================================");
        List<Object[]> topRated = reviewDAO.getTopRatedItems(10);
        if (topRated.isEmpty()) {
            System.out.println("   [INFO] No ratings available.");
        } else {
            System.out.printf("   %-5s %-30s %-12s %-10s%n", "ID", "Item Name", "Avg Rating", "Reviews");
            System.out.println("   --------------------------------------------------------");
            for (Object[] item : topRated) {
                double avgRating = (double) item[2];
                String ratingDisplay = avgRating > 0 ? String.format("%.1f/5", avgRating) : "No ratings";
                System.out.printf("   %-5d %-30s %-12s %-10d%n",
                        (int) item[0],
                        truncate((String) item[1], 30),
                        ratingDisplay,
                        (int) item[3]);
            }
        }
        System.out.println("========================================");
    }

    private static void viewPaymentMethodStats() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("       PAYMENT METHOD STATISTICS");
        System.out.println("========================================");
        List<Object[]> stats = salesDAO.getPaymentMethodStats();
        if (stats.isEmpty()) {
            System.out.println("   [INFO] No payment data available.");
        } else {
            System.out.printf("   %-20s %-10s %-15s%n", "Payment Method", "Usage", "Total Amount");
            System.out.println("   --------------------------------------------------------");
            for (Object[] stat : stats) {
                System.out.printf("   %-20s %-10d $%-14.2f%n",
                        (String) stat[0],
                        (int) stat[1],
                        (double) stat[2]);
            }
        }
        System.out.println("========================================");
    }

    private static void salesReport() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("            SALES REPORT");
        System.out.println("========================================");
        System.out.println("   1. Daily Report");
        System.out.println("   2. Weekly Report");
        System.out.println("   3. Monthly Report");
        System.out.println("----------------------------------------");
        System.out.print("   Choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Date endDate = new Date(System.currentTimeMillis());
        Date startDate = null;
        LocalDate today = LocalDate.now();
        switch (choice) {
            case 1:
                startDate = Date.valueOf(today.minusDays(1));
                System.out.println("   Showing report for: " + startDate);
                break;
            case 2:
                startDate = Date.valueOf(today.minusDays(7));
                System.out.println("   Showing report for last 7 days");
                break;
            case 3:
                startDate = Date.valueOf(today.minusDays(30));
                System.out.println("   Showing report for last 30 days");
                break;
            default:
                System.out.println("   [ERROR] Invalid choice!");
                return;
        }
        List<SalesReport> reports = salesDAO.getDailySalesReport(startDate, endDate);
        if (reports.isEmpty()) {
            System.out.println("   [INFO] No sales data found.");
        } else {
            double totalRevenue = 0;
            int totalOrders = 0;
            System.out.printf("   %-12s %-10s %-15s %-15s%n", "Date", "Orders", "Revenue", "Avg Order");
            System.out.println("   --------------------------------------------------------");
            for (SalesReport report : reports) {
                System.out.printf("   %-12s %-10d $%-14.2f $%-14.2f%n",
                        report.getSaleDate(),
                        report.getTotalOrders(),
                        report.getTotalRevenue(),
                        report.getAvgOrderValue());
                totalRevenue += report.getTotalRevenue();
                totalOrders += report.getTotalOrders();
            }
            System.out.println("   --------------------------------------------------------");
            System.out.printf("   TOTAL: %-10d $%-14.2f%n", totalOrders, totalRevenue);
        }
        System.out.println("========================================");
    }

    private static void viewProfile() {
        System.out.println("\n========================================");
        System.out.println("              MY PROFILE");
        System.out.println("========================================");
        System.out.println("   ID: " + currentUser.getId());
        System.out.println("   Name: " + currentUser.getName());
        System.out.println("   Email: " + currentUser.getEmail());
        System.out.println("   Role: " + currentUser.getRole().toUpperCase());
        System.out.println("   Birth Date: " + currentUser.getBirthDate());
        System.out.println("   Present Address: " + truncate(currentUser.getPresentAddress(), 40));
        System.out.println("   Permanent Address: " + truncate(currentUser.getPermanentAddress(), 40));
        System.out.println("   Registration Date: " + currentUser.getRegistrationDate());
        System.out.println("========================================");
    }

    private static void viewInventory() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("           CANTEEN INVENTORY");
        System.out.println("========================================");
        List<Inventory> inventory = inventoryDAO.getAllInventory();
        System.out.printf("   %-12s %-30s %-10s %-10s%n", "ID", "Item Name", "Quantity", "Unit");
        System.out.println("   --------------------------------------------------------");
        for (Inventory inv : inventory) {
            System.out.printf("   %-12d %-30s %-10d %-10s%n",
                    inv.getInventoryId(),
                    truncate(inv.getItemName(), 30),
                    inv.getQuantity(),
                    inv.getUnit());
        }
        System.out.println("========================================");
    }

    private static void viewAllOrders() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("             ALL ORDERS");
        System.out.println("========================================");
        List<Object[]> orders = orderDAO.getAllOrdersWithCustomer();
        if (orders.isEmpty()) {
            System.out.println("   [INFO] No orders found.");
        } else {
            System.out.printf("   %-8s %-20s %-12s %-10s %-12s %-10s%n",
                    "Order ID", "Customer", "Date", "Amount", "Status", "Payment");
            System.out.println("   -----------------------------------------------------------------");
            for (Object[] order : orders) {
                System.out.printf("   %-8d %-20s %-12s $%-9.2f %-12s %-10s%n",
                        (int) order[0],
                        truncate((String) order[1], 20),
                        order[2],
                        (double) order[3],
                        (String) order[4],
                        (String) order[5]);
            }
        }
        System.out.println("========================================");
    }

    private static void updateOrderStatus() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("          UPDATE ORDER STATUS");
        System.out.println("========================================");
        System.out.print("   Order ID: ");
        int orderId = Integer.parseInt(scanner.nextLine());
        System.out.print("   New Status (Preparing/Ready/Served): ");
        String status = scanner.nextLine();
        orderDAO.updateOrderStatus(orderId, status);
        System.out.println("----------------------------------------");
        System.out.println("   [OK] Order status updated to: " + status);
        System.out.println("========================================");
    }

    private static void viewMyOrders() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("            MY ORDER HISTORY");
        System.out.println("========================================");
        String query = "SELECT o.Order_ID, o.Order_Date_, o.Total_Amount, o.Order_Status, o.Payment_Method, " +
                "oi.Quantity, oi.Item_price, m.Item_Name_ " +
                "FROM Orders o INNER JOIN Order_Item oi ON o.Order_ID = oi.Order_ID " +
                "INNER JOIN Menu_Item_ m ON oi.Item_ID = m.Item_ID WHERE o.ID = ? ORDER BY o.Order_ID DESC";
        try (PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, currentUser.getId());
            ResultSet rs = pstmt.executeQuery();
            int currentOrderId = -1;
            boolean hasOrders = false;
            while (rs.next()) {
                int orderId = rs.getInt("Order_ID");
                hasOrders = true;
                if (currentOrderId != orderId) {
                    if (currentOrderId != -1) {
                        System.out.println("   ------------------------------------------------------------");
                    }
                    currentOrderId = orderId;
                    System.out.printf("   Order ID: %d\n", orderId);
                    System.out.printf("   Date: %s\n", rs.getDate("Order_Date_"));
                    System.out.printf("   Total: $%.2f\n", rs.getDouble("Total_Amount"));
                    System.out.printf("   Status: %s\n", rs.getString("Order_Status"));
                    System.out.printf("   Payment: %s\n", rs.getString("Payment_Method"));
                    System.out.println("   Items:");
                }
                String itemName = rs.getString("Item_Name_");
                int quantity = rs.getInt("Quantity");
                double itemPrice = rs.getDouble("Item_price");
                double subtotal = quantity * itemPrice;
                System.out.printf("      - %s x%d = $%.2f\n", truncate(itemName, 35), quantity, subtotal);
            }
            if (!hasOrders) {
                System.out.println("   [INFO] No orders found.");
            }
            System.out.println("========================================");
        }
    }

    private static void placeOrder() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("              PLACE ORDER");
        System.out.println("========================================");
        viewMenu();
        Order order = new Order();
        order.setOrderDate(new Date(System.currentTimeMillis()));
        order.setOrderStatus("Preparing");
        order.setUserId(currentUser.getId());
        List<OrderItem> orderItems = new ArrayList<>();
        double totalAmount = 0;
        System.out.println("----------------------------------------");
        System.out.print("   Payment Method (Cash/Card/Canteen Card): ");
        order.setPaymentMethod(scanner.nextLine());
        int oiID = getaid();
        while (true) {
            System.out.print("\n   Enter Item ID (0 to finish): ");
            int itemId = Integer.parseInt(scanner.nextLine());
            if (itemId == 0)
                break;
            MenuItem item = menuDAO.getMenuItemById(itemId);
            if (item == null) {
                System.out.println("   [ERROR] Item not found!");
                continue;
            }
            System.out.print("   Enter Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!recipeDAO.checkRecipeStock(itemId, quantity)) {
                System.out.println("   [ERROR] Cannot add item due to insufficient ingredients!");
                continue;
            }
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderItemId(oiID++);
            orderItem.setQuantity(quantity);
            orderItem.setItemPrice(item.getPrice());
            orderItem.setItemId(itemId);
            orderItems.add(orderItem);
            totalAmount += item.getPrice() * quantity;
            System.out.println("   [OK] Added " + quantity + " x " + item.getItemName());
        }
        if (orderItems.isEmpty()) {
            System.out.println("----------------------------------------");
            System.out.println("   [ERROR] No items ordered!");
            System.out.println("========================================");
            return;
        }
        order.setTotalAmount(totalAmount);
        int generatedOrderId = orderDAO.createOrder(order);
        for (OrderItem oi : orderItems) {
            oi.setOrderId(generatedOrderId);
            orderDAO.addOrderItem(oi);
            recipeDAO.deductRecipeStock(oi.getItemId(), oi.getQuantity());
        }
        System.out.println("----------------------------------------");
        System.out.println("   [OK] ORDER PLACED SUCCESSFULLY!");
        System.out.println("   Order ID: " + generatedOrderId);
        System.out.println("   Total Amount: $" + totalAmount);
        System.out.println("   Status: Preparing - Please wait!");
        System.out.println("========================================");
    }

    private static void addReview() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("              ADD REVIEW");
        System.out.println("========================================");
        viewMenu();
        System.out.print("\n   Enter Item ID to review: ");
        int itemId = Integer.parseInt(scanner.nextLine());
        MenuItem item = menuDAO.getMenuItemById(itemId);
        if (item == null) {
            System.out.println("   [ERROR] Item not found!");
            return;
        }
        System.out.println("   Reviewing: " + item.getItemName());
        System.out.print("   Rating (1-5): ");
        double rating = Double.parseDouble(scanner.nextLine());
        if (rating < 1 || rating > 5) {
            System.out.println("   [ERROR] Rating must be between 1 and 5!");
            return;
        }
        System.out.print("   Comment: ");
        String comment = scanner.nextLine();
        Review review = new Review();
        review.setRating(rating);
        review.setComment(comment);
        review.setUserId(currentUser.getId());
        review.setItemId(itemId);
        reviewDAO.addReview(review);
        System.out.println("========================================");
    }

    private static void viewItemReviews() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("           ITEM REVIEWS");
        System.out.println("========================================");
        viewMenu();
        System.out.print("\n   Enter Item ID to view reviews: ");
        int itemId = Integer.parseInt(scanner.nextLine());
        List<Review> reviews = reviewDAO.getReviewsByItem(itemId);
        double avgRating = reviewDAO.getAverageRating(itemId);
        if (reviews.isEmpty()) {
            System.out.println("   [INFO] No reviews yet for this item.");
        } else {
            System.out.printf("   Average Rating: %.1f/5 (Based on %d reviews)\n", avgRating, reviews.size());
            System.out.println("   ----------------------------------------");
            for (Review r : reviews) {
                System.out.printf("   Rating: %.1f/5 | By: %s\n", r.getRating(), r.getUserName());
                System.out.printf("   Comment: %s\n", truncate(r.getComment(), 50));
                System.out.println("   ----------------------------------------");
            }
        }
        System.out.println("========================================");
    }

    private static void viewRecipes() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("              RECIPES");
        System.out.println("========================================");
        List<Recipe> recipes = recipeDAO.getAllRecipes();
        if (recipes.isEmpty()) {
            System.out.println("   [INFO] No recipes defined.");
        } else {
            for (Recipe recipe : recipes) {
                System.out.printf("   Recipe ID: %d | Item: %s\n", recipe.getRecipeId(), recipe.getItemName());
                System.out.println("   Ingredients:");
                for (RecipeIngredient ing : recipe.getIngredients()) {
                    System.out.printf("      - %s: %d %s\n", ing.getInventoryName(), ing.getQuantityReq(),
                            ing.getUnit());
                }
                System.out.println("   ----------------------------------------");
            }
        }
        System.out.println("========================================");
    }

    private static void manageMenu() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("             MANAGE MENU");
        System.out.println("========================================");
        System.out.println("   1. Add New Item");
        System.out.println("   2. View All Items");
        System.out.println("----------------------------------------");
        System.out.print("   Choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            MenuItem item = new MenuItem();
            System.out.print("   Item ID: ");
            item.setItemId(Integer.parseInt(scanner.nextLine()));
            System.out.print("   Item Name: ");
            item.setItemName(scanner.nextLine());
            System.out.print("   Price: ");
            item.setPrice(Double.parseDouble(scanner.nextLine()));
            System.out.print("   Availability Status (Available/Not Available): ");
            item.setAvailabilityStatus(scanner.nextLine());
            System.out.print("   Preparation Time (minutes): ");
            item.setPreparationTime(Integer.parseInt(scanner.nextLine()));
            System.out.print("   Category ID: ");
            item.setCategoryId(Integer.parseInt(scanner.nextLine()));
            menuDAO.addMenuItem(item);
            System.out.println("========================================");
        } else {
            viewMenu();
        }
    }

    private static void manageInventory() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("           MANAGE INVENTORY");
        System.out.println("========================================");
        viewInventory();
        System.out.print("\n   Inventory ID to update: ");
        int invId = Integer.parseInt(scanner.nextLine());
        System.out.print("   New Quantity: ");
        int newQty = Integer.parseInt(scanner.nextLine());
        inventoryDAO.updateInventory(invId, newQty);
        System.out.println("========================================");
    }

    private static void manageStaff() throws SQLException {
        System.out.println("\n========================================");
        System.out.println("             MANAGE STAFF");
        System.out.println("========================================");
        System.out.println("   1. Add Staff Member");
        System.out.println("   2. View All Staff");
        System.out.println("   3. View Staff Details");
        System.out.println("----------------------------------------");
        System.out.print("   Choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            User user = new User();
            System.out.print("   ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            if (userDAO.isIdExists(id)) {
                System.out.println("----------------------------------------");
                System.out.println("   [ERROR] ID already exists!");
                System.out.println("========================================");
                return;
            }
            user.setId(id);
            System.out.print("   Name: ");
            user.setName(scanner.nextLine());
            System.out.print("   Email: ");
            user.setEmail(scanner.nextLine());
            System.out.print("   Password: ");
            user.setPassword(scanner.nextLine());
            System.out.print("   Birth Date (YYYY-MM-DD):  ");
            user.setBirthDate(Date.valueOf(scanner.nextLine()));
            System.out.print("   Present Address: ");
            user.setPresentAddress(scanner.nextLine());
            System.out.print("   Permanent Address: ");
            user.setPermanentAddress(scanner.nextLine());
            user.setRole("staff");
            user.setRegistrationDate(new Date(System.currentTimeMillis()));
            if (userDAO.registerUser(user)) {
                System.out.println("----------------------------------------");
                System.out.println("   [OK] Staff registered successfully!");
                System.out.print("   Phone number: ");
                String phone = scanner.nextLine();
                userDAO.addPhone(user.getId(), phone);
            } else {
                System.out.println("   [ERROR] Registration failed!");
                return;
            }
            Staff staff = new Staff();
            staff.setUserId(user.getId());
            System.out.print("   Salary: ");
            staff.setSalary(Double.parseDouble(scanner.nextLine()));
            System.out.print("   Working Hours per day: ");
            staff.setWorkingHour(Integer.parseInt(scanner.nextLine()));
            staffDAO.addStaff(staff);
            System.out.println("========================================");
        } else if (choice == 2) {
            List<Staff> staffList = staffDAO.getAllStaff();
            if (staffList.isEmpty()) {
                System.out.println("   [INFO] No staff members found.");
            } else {
                System.out.printf("   %-10s %-12s %-15s%n", "User ID", "Salary", "Working Hours");
                System.out.println("   ----------------------------------------");
                for (Staff s : staffList) {
                    System.out.printf("   %-10d $%-11.2f %-15d%n", s.getUserId(), s.getSalary(), s.getWorkingHour());
                }
            }
            System.out.println("========================================");
        } else {
            List<Object[]> staffDetails = staffDAO.getStaffWithDetails();
            if (staffDetails.isEmpty()) {
                System.out.println("   [INFO] No staff details found.");
            } else {
                System.out.printf("   %-8s %-20s %-10s %-8s %-25s %-15s%n", "ID", "Name", "Salary", "Hours", "Email",
                        "Phone");
                System.out.println("   -----------------------------------------------------------------");
                for (Object[] sd : staffDetails) {
                    System.out.printf("   %-8d %-20s $%-9.2f %-8d %-25s %-15s%n",
                            (int) sd[0],
                            truncate((String) sd[1], 20),
                            (double) sd[2],
                            (int) sd[3],
                            truncate((String) sd[4], 25),
                            sd[5] != null ? sd[5] : "N/A");
                }
            }
            System.out.println("========================================");
        }
    }

    private static int getaid() {
        String getMaxIdQuery = "SELECT MAX(OrderItem_ID) FROM order_item";
        int nextId = 1;
        try (Statement stmt = DatabaseConnection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(getMaxIdQuery)) {
            if (rs.next()) {
                nextId = rs.getInt(1) + 1;
            }
        } catch (SQLException e) {
            System.out.println("[ERROR] Failed to get next ID: " + e.getMessage());
        }
        return nextId;
    }

    private static String truncate(String str, int length) {
        if (str == null)
            return "";
        if (str.length() <= length)
            return str;
        return str.substring(0, length - 3) + "...";
    }
}
