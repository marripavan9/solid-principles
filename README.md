# Vaccine Management System

## Overview

This project demonstrates the application of SOLID principles in a simple Vaccine Management System. The principles covered include:

1. [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
2. [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
3. [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
4. [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
5. [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)

## Single Responsibility Principle (SRP)

### `VaccineManager` Class

The `VaccineManager` class represents the properties and behaviors related to a generic vaccine. It includes methods for administering doses, calculating effectiveness, and saving vaccine doses to the database. The violation and solution are demonstrated by separating concerns into distinct classes.

### `VaccineAdministrationService, VaccineDoseDatabaseHandler, VaccineEffectivenessCalculator`  Class

The `VaccineAdministrationService, VaccineDoseDatabaseHandler, VaccineEffectivenessCalculator` class adheres to SRP by focusing solely on administering vaccine doses.

## Open/Closed Principle (OCP)

### `Vaccine, PfizerVaccine` and `CoviShieldVaccine` Classes

The violation of the OCP is demonstrated by the `Vaccine` class, which is modified when introducing a new type of vaccine (`PfizerVaccine`). The solution adheres to the OCP by creating an abstract class (`Vaccine`) and allowing for extensibility without modifying existing code.

## Liskov Substitution Principle (LSP)

### `Vaccine` and `PfizerVaccine` Classes

A violation of LSP is demonstrated by having a subclass (`PfizerVaccine`) that does not maintain the expected behavior of the base class (`Vaccine`). The solution involves using an abstract class for vaccines, adhering to LSP.

## Interface Segregation Principle (ISP)

### `Vaccine` and `ModernaVaccine` Classes

ISP is demonstrated by introducing interfaces (`AdministerDose`, `CalculateEffectiveness`, and `SaveVaccineDose`) to represent specific aspects of a vaccine. The violation and solution showcase a class that implements only the interfaces relevant to its functionality.

## Dependency Inversion Principle (DIP)

### `VaccinationService` and `PfizerVaccine` Classes

The violation of DIP is demonstrated by having a high-level module (`VaccinationService`) directly depend on a low-level module (`PfizerVaccine`). The solution adheres to DIP by introducing an abstraction (`Vaccine`) and having the high-level module depend on the abstraction, allowing for flexibility in vaccine implementations.

