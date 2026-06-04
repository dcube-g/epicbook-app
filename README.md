# EpicBook Application Deployment

This repository contains:

- Ansible playbooks
- Nginx configuration
- Azure DevOps application pipeline

Deployment target:

- Azure VM provisioned by Terraform
- Ubuntu 22.04
- Java 17
- Nginx

Workflow:

Azure DevOps -> Ansible -> Azure VM
