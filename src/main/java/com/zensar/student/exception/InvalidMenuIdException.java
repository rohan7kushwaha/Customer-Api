 // Source code is unavailable, and was generated by the Fernflower decompiler.
package com.zensar.student.exception;

public class InvalidMenuIdException extends RuntimeException {
   private String message;

   public InvalidMenuIdException() {
      this.message = "";
   }

   public InvalidMenuIdException(String message) {
      this.message = message;
   }

   public String toString() {
      return "Menu id is not found " + this.message;
   }
}
