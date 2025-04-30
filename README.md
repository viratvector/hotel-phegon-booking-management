## Technology used

1. Backend: Java 21, Spring Boot 3, Spring Security with JWT Authentication, REST API
2. Frontend: HTML, CSS, JavaScript, React.js
3. Database and Storage: PostgreSQL, AWS S3
4. API Testing: Postman

## Video link

<https://www.loom.com/share/f5de32effbd04c788a43894700ff1fce?sid=47f7e5b9-d996-4fb2-bd85-a91ca9601e1a>

## Overview

The Phegon Hotel Booking Management System provides a platform for managing hotel room bookings with distinct user roles.

1. User Features:

- Secure registration/login system
- Date based room availability checking
- Room filtering by type/price(Luxury, Dormitory, etc)
- Booking management with confirmation code
- Book room and view booking details


1. Admin Features:

- Room Inventory Management(Add/Edit/Delete)
- User management
- Image upload/management via S3

1. System Features:

- Responsive UI with secure login/sign up
- Real time price/availability updates
- User Authorization and Authentication
- Booking Confirmation System

## Implementation

1. Entities: Java classes(Users, Rooms, Bookings) mapped to tables in DB
2. Backend: Java and Spring Boot used for building the backend API, handling business logic, and managing data interactions The backend will expose various API endpoints (likely RESTful) that the React.js frontend consumes for actions like fetching rooms, creating bookings, user authentication and retrieving booking details. Spring Security implemented for user authentication (login and registration) and authorization (controlling access based on user roles like admin and standard user). JWT is likely used to manage and verify user sessions after login.
3. Frontend: HTML, CSS and JavaScript form the basic structure, styling, and client-side interactivity of the web pages. React.js powers the frontend user interface, providing a dynamic and interactive experience for browsing rooms, making bookings, and viewing booking details. It interacts with the backend API to fetch and display data.
4. AWS S3: Code related to uploading, storing, and retrieving room images will be present in the backend to interact with the AWS S3 service. This ensures scalable image storage and delivery.

## Future Scope

1. Payment Gateway Integration
2. Booking Rating System
3. Generate PDF of the booking and payment details


Development_setup:
- mvn spring-boot:run
- npm install
- npm start (node version 18)
