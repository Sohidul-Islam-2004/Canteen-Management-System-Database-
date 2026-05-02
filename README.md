# 🍽️ Canteen Management System

A complete Canteen Management System with Java JDBC and MySQL. Supports Admin, Staff, and Customer roles with order management, inventory tracking, and sales reports.

## ✨ Features

| Role | Access Level | Features |
|------|-------------|----------|
| **Admin** | Full Control | Menu, Inventory, Staff, Reports, Analytics |
| **Staff** | Operational | Orders, Inventory view, Recipes, Stock alerts |
| **Customer** | Basic | Menu browsing, Order placement, Reviews, History |

### 🎯 Core Functionalities

- ✅ **User Management** - Registration, Login with security check, Profile management
- ✅ **Menu Management** - Browse by categories, View ratings, Check availability
- ✅ **Order Processing** - Place orders, Track status, Payment methods (Cash/Card/Canteen Card)
- ✅ **Inventory Control** - Real-time stock tracking, Low stock alerts (<50 units)
- ✅ **Recipe System** - Ingredient mapping, Automatic stock deduction
- ✅ **Review & Rating** - Rate items (1-5⭐), Write comments, View average ratings
- ✅ **Sales Analytics** - Daily/Weekly/Monthly reports, Top selling items, Revenue tracking
- ✅ **Staff Management** - Manage salaries, Working hours, Performan


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


