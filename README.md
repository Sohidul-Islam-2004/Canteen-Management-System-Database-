# 🍽️ Canteen Management System

A complete Canteen Management System with Java JDBC and MySQL. Supports Admin, Staff, and Customer roles with order management, inventory tracking, and sales reports.

## Features

- **Admin**: Full control over menu, inventory, staff, and reports
- **Staff**: Process orders, view inventory and recipes
- **Customer**: Browse menu, place orders, write reviews, view order history

## Tech Stack

- Java 17+
- MySQL 8.0+
- JDBC for database connectivity

---

## Database Setup Guide

### Step 1: Install MySQL

Download and install MySQL 8.0+ from https://dev.mysql.com/downloads/

### Step 2: Import Database using MySQL Workbench

1. **Open MySQL Workbench**
2. **Connect to your local instance** (click on "Local instance MySQL")
3. **Open the SQL file**: File → Open SQL Script (Ctrl+Shift+O)
4. **Select** `Schema and Data.sql` from your downloaded files
5. **Execute the script**: Click the lightning bolt icon (or press Ctrl+Shift+Enter)
6. **Wait** for all queries to complete (you'll see green checkmarks)
7. **Refresh**: Right-click in Schemas panel → Refresh All

You should now see `canteen_management_system` database in the Schemas list.

### Step 3: Verify Database Import

In MySQL Workbench, run this query:

```sql
USE canteen_management_system;
SELECT COUNT(*) FROM users;
