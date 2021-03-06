package dk.mf.ms.car_catalog;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Car
{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @NonNull private String brand;
        @NonNull private int year;
        @NonNull private long km;
}
