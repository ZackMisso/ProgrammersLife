//
//  Job.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Job : NSObject{
    NSMutableArray *minRequirements;
    float performance;
    int minNumberOfHoursPerTwoWeeks;
    int hoursAssigned;
    BOOL internship;
}

// getter methods
-(NSMutableArray*)getMinRequirements;
-(float)getPerformance;
-(int)getMinNumberOfHoursPerTwoWeeks;
-(int)getHoursAssigned;
-(BOOL)getInternship;

// setter methods
-(void)setMinRequirements:(NSMutableArray*)value;
-(void)setPerformance:(float)value;
-(void)setMinNumberOfHoursPerTwoWeeks:(int)value;
-(void)setHoursAssigned:(int)value;
-(void)setInternship:(BOOL)value;

@end
