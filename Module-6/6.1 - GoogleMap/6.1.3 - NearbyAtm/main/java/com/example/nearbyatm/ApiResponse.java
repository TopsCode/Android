package com.example.nearbyatm;

import java.util.List;



public class ApiResponse {
    private final List<Object> htmlAttributions;

    private final List<Results> results;

    private final String status;

    public ApiResponse(List<Object> htmlAttributions, List<Results> results, String status) {
        this.htmlAttributions = htmlAttributions;
        this.results = results;
        this.status = status;
    }

    public List<Object> getHtmlAttributions() {
        return htmlAttributions;
    }

    public List<Results> getResults() {
        return results;
    }

    public String getStatus() {
        return status;
    }

    public static class Results {
        private final Geometry geometry;

        private final String icon;

        private final String id;

        private final String name;

        private final OpeningHours openingHours;

        private final String placeId;

        private final PlusCode plusCode;

        private final int rating;

        private final String reference;

        private final String scope;

        private final List<String> types;

        private final int userRatingsTotal;

        private final String vicinity;

        public Results(Geometry geometry, String icon, String id, String name,
                       OpeningHours openingHours, String placeId, PlusCode plusCode, int rating,
                       String reference, String scope, List<String> types, int userRatingsTotal,
                       String vicinity) {
            this.geometry = geometry;
            this.icon = icon;
            this.id = id;
            this.name = name;
            this.openingHours = openingHours;
            this.placeId = placeId;
            this.plusCode = plusCode;
            this.rating = rating;
            this.reference = reference;
            this.scope = scope;
            this.types = types;
            this.userRatingsTotal = userRatingsTotal;
            this.vicinity = vicinity;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public String getIcon() {
            return icon;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public OpeningHours getOpeningHours() {
            return openingHours;
        }

        public String getPlaceId() {
            return placeId;
        }

        public PlusCode getPlusCode() {
            return plusCode;
        }

        public int getRating() {
            return rating;
        }

        public String getReference() {
            return reference;
        }

        public String getScope() {
            return scope;
        }

        public List<String> getTypes() {
            return types;
        }

        public int getUserRatingsTotal() {
            return userRatingsTotal;
        }

        public String getVicinity() {
            return vicinity;
        }

        public static class Geometry {
            private final Location location;

            private final Viewport viewport;

            public Geometry(Location location, Viewport viewport) {
                this.location = location;
                this.viewport = viewport;
            }

            public Location getLocation() {
                return location;
            }

            public Viewport getViewport() {
                return viewport;
            }

            public static class Location {
                private final double lat;

                private final double lng;

                public Location(double lat, double lng) {
                    this.lat = lat;
                    this.lng = lng;
                }

                public double getLat() {
                    return lat;
                }

                public double getLng() {
                    return lng;
                }
            }

            public static class Viewport {
                private final Northeast northeast;

                private final Southwest southwest;

                public Viewport(Northeast northeast, Southwest southwest) {
                    this.northeast = northeast;
                    this.southwest = southwest;
                }

                public Northeast getNortheast() {
                    return northeast;
                }

                public Southwest getSouthwest() {
                    return southwest;
                }

                public static class Northeast {
                    private final double lat;

                    private final double lng;

                    public Northeast(double lat, double lng) {
                        this.lat = lat;
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }

                public static class Southwest {
                    private final double lat;

                    private final double lng;

                    public Southwest(double lat, double lng) {
                        this.lat = lat;
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }
            }
        }

        public static class OpeningHours {
            private final boolean openNow;

            public OpeningHours(boolean openNow) {
                this.openNow = openNow;
            }

            public boolean isOpenNow() {
                return openNow;
            }
        }

        public static class PlusCode {
            private final String compoundCode;

            private final String globalCode;

            public PlusCode(String compoundCode, String globalCode) {
                this.compoundCode = compoundCode;
                this.globalCode = globalCode;
            }

            public String getCompoundCode() {
                return compoundCode;
            }

            public String getGlobalCode() {
                return globalCode;
            }
        }
    }
}
