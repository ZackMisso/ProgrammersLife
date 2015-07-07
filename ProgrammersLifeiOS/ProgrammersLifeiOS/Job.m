//
//  Job.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Job.h"

@implementation Job

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}


// getter methods
-(NSMutableArray*)getMinRequirements { return minRequirements; }
-(float)getPerformance { return performance; }
-(int)getMinNumberOfHoursPerTwoWeeks { return minNumberOfHoursPerTwoWeeks; }
-(int)getHoursAssigned { return hoursAssigned; }
-(BOOL)getInternship { return internship; }

// setter methods
-(void)setMinRequirements:(NSMutableArray*)value { minRequirements = value; }
-(void)setPerformance:(float)value { performance = value; }
-(void)setMinNumberOfHoursPerTwoWeeks:(int)value { minNumberOfHoursPerTwoWeeks = value; }
-(void)setHoursAssigned:(int)value { hoursAssigned = value; }
-(void)setInternship:(BOOL)value { internship = value; }

@end