# Cloud Inventory App - AWS Deployed Backend

A cloud-native inventory management backend built with **Spring Boot**, **PostgreSQL**, and **Docker**, then deployed to **AWS ECS Fargate** using **Amazon ECR**, **Amazon RDS**, **Application Load Balancer**, and **CloudWatch Logs**.

This project demonstrates a real-world backend deployment workflow, including containerization, cloud database configuration, environment-based application settings, AWS networking, load balancing, logging, and deployment debugging.

---

## Project Overview

The Cloud Inventory App is a backend API for managing product inventory. It supports creating and retrieving product records through REST API endpoints.

The main goal of this project was not only to build the backend, but also to deploy it using an industry-style AWS container architecture.

---

## Live Backend Status

The backend was successfully deployed to AWS and tested through an Application Load Balancer.

Verified endpoints:

```bash
GET /actuator/health
GET /api/products
POST /api/products

