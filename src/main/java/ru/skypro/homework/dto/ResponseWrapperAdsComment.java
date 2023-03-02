package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.models.Ads;

import java.util.Collection;

@Data
public class ResponseWrapperAdsComment {
    Integer count;
    Collection<Ads> results;
}
