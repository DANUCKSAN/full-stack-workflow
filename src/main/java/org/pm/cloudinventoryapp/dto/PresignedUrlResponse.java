package org.pm.cloudinventoryapp.dto;

public record PresignedUrlResponse(
        String uploadUrl,
        String fileUrl,
        String key
) {
}
