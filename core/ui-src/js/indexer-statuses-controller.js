angular
    .module('nzbhydraApp')
    .controller('IndexerStatusesController', IndexerStatusesController);

function IndexerStatusesController($scope, $http, statuses) {
    $scope.statuses = statuses.data;
    $scope.expiryWarnings = {};

    $scope.formatState = function (state) {
        if (state === "ENABLED") {
            return "Enabled";
        } else if (state === "DISABLED_SYSTEM_TEMPORARY") {
            return "Temporarily disabled by system";
        } else if (state === "DISABLED_SYSTEM") {
            return "Disabled by system";
        } else {
            return "Disabled by user";
        }
    };

    $scope.getLabelClass = function (state) {
        if (state === "ENABLED") {
            return "primary";
        } else if (state === "DISABLED_SYSTEM_TEMPORARY") {
            return "warning";
        } else if (state === "DISABLED_SYSTEM") {
            return "danger";
        } else {
            return "default";
        }
    };

    $scope.isInPast = function (epochSeconds) {
        return epochSeconds < moment().unix();
    };


    _.each($scope.statuses, function (status) {
            if (status.vipExpirationDate != null && status.vipExpirationDate !== "Lifetime") {
                var expiryDate = moment(status.vipExpirationDate, "YYYY-MM-DD");
                var messagePrefix = "VIP access";
                if (expiryDate < moment()) {
                    status.expiryWarning = messagePrefix + " expired";
                } else if (expiryDate.subtract(7, 'days') < moment()) {
                    status.expiryWarning = messagePrefix + " will expire in the next 7 days";
                }
                console.log(status.expiryWarning);
            }
        }
    )
    ;
}

angular
    .module('nzbhydraApp')
    .filter('formatDate', formatDate);

function formatDate(dateFilter) {
    return function (timestamp, hidePast) {
        if (timestamp) {
            if (timestamp * 1000 < (new Date).getTime() && hidePast) {
                return ""; //
            }

            var t = timestamp * 1000;
            t = dateFilter(t, 'yyyy-MM-dd HH:mm');
            return t;
        } else {
            return "";
        }
    }
}

angular
    .module('nzbhydraApp')
    .filter('reformatDate', reformatDate);

function reformatDate() {
    return function (date, format) {
        if (!date) {
            return "";
        }
        if (angular.isUndefined(format)) {
            format = "YYYY-MM-DD HH:mm";
        }
        //Date in database is saved as UTC without timezone information
        return moment.unix(date).local().format(format);
    }
}

angular
    .module('nzbhydraApp')
    .filter('reformatDateSeconds', reformatDateSeconds);

function reformatDateSeconds() {
    return function (date, format) {
        return moment.unix(date).local().format("YYYY-MM-DD HH:mm:ss");
    }
}


angular
    .module('nzbhydraApp')
    .filter('humanizeDate', humanizeDate);

function humanizeDate() {
    return function (date) {
        return moment().to(moment.unix(date));
    }
}