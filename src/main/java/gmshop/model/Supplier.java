package gmshop.model;


import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name="supplier")
public class Supplier {


        public Supplier(){}
@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
int supplier_id;

@Column(name = "supplier_address")
@NotEmpty(message = "pls enter address")
String supplier_address;

@Column(name = "supplier_name")
@NotEmpty(message = "pls enter name")
        @Size(min = 2,max = 30)
String supplier_name;



@Column(name="supplier_contact")
@Pattern(regexp="(^|[0-9]{10})")
String supplier_contact;

        public int getSupplier_id() {
                return supplier_id;
        }

        public void setSupplier_id(int supplier_id) {
                this.supplier_id = supplier_id;
        }

        public String getSupplier_address() {
                return supplier_address;
        }

        public void setSupplier_address(String supplier_address) {
                this.supplier_address = supplier_address;
        }

        public String getSupplier_name() {
                return supplier_name;
        }

        public void setSupplier_name(String supplier_name) {
                this.supplier_name = supplier_name;
        }

        public String     getSupplier_contact() {
                return supplier_contact;
        }

        public void setSupplier_contact(String supplier_contact) {
                this.supplier_contact = supplier_contact;
        }
}
